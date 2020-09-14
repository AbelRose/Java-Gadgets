package com.matrix.test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadSynchronize {

    public static void main(String[] args) throws Exception{

        // 创建未来任务
        FutureTask<Integer> task1 = new FutureTask<Integer>(new MyCallable10());
        FutureTask<Integer> task2 = new FutureTask<Integer>(new MyCallable100());
        FutureTask<Integer> task3 = new FutureTask<Integer>(new MyCallable1000());

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
        // 上面的线程是不需要等待的 并行执行

        System.out.println(task1.get());
        System.out.println(task2.get());
        System.out.println(task3.get());

        System.out.println("main sum = " + task1.get() + task2.get() + task3.get());
        // get() 保证三个线程必须执行完毕 比如说取数据的时候 一定要保证数据能够最后能够完全取得到 不会出现只取到线程1+2执行后的结果等情况
        // 只要调用这个get() 当前线程就会阻塞 是同步的非异步
    }
}

class MyCallable10 implements Callable<Integer> {

    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Thread1 执行了");
        return sum;
    }
}

class MyCallable100 implements Callable<Integer> {

    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Thread2 执行了");
        return sum;
    }
}

class MyCallable1000 implements Callable<Integer> {

    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println("Thread3 执行了");
        return sum;
    }
}
