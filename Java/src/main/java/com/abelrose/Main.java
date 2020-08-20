package com.abelrose;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    /**
     * http://dlqatserver25/QAT20.L.2007.0.0-00028/008002_000/
     *
     * @param args
     */


    public static void main(String[] args) throws Exception {
        File file = new File("D:\\IdeaProjects\\Java\\src\\main\\resources\\CaseNum.txt");
        File file1 = new File("D:\\IdeaProjects\\Java\\src\\main\\resources\\CaseJen.txt");
        BufferedReader reader = null;
        BufferedReader reader1 = null;

//        System.out.println("以行为单位读取文件内容，一次读一整行：");
        reader = new BufferedReader(new FileReader(file));
//        reader1 = new BufferedReader(new FileReader(file1));
        String tempString = null;
        int line = 1;
        int line1 = 1;
        // 一次读入一行，直到读入null为文件结束
        while ((tempString = reader.readLine()) != null) {
            // 显示行号
//            System.out.println("line " + line + ": " + tempString);
            line++;

            String tempString1 = null;
            reader1 = new BufferedReader(new FileReader(file1));
            while ((tempString1 = reader1.readLine()) != null){

//                System.out.println(tempString);
//                System.out.println(tempString1);



                if(tempString.equals(tempString1)){
//                    System.out.println("存在");
//                    System.out.println("dlqatserver25/QAT20.L.2007.0.0-00028/"+ tempString1 +"_000/");
                    System.out.println(tempString1);
                    break;
                }else {
//                    System.out.println("====================");

//                    tempString1 = reader1.readLine();
                }

            }



        }
        reader.close();

    }
}
