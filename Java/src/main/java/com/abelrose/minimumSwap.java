/**
*
*  fun: minimumSwap 
*
*  Des: 交换字符使得字符串相同
*
*  Author: @sunyihao
*
*/

public static int minimumSwap(String str1 ,String str2) {
	
	int a, b = 0;
	int res = 0;
	
	for (int i = 0; i < str1.length; i++) {
		
		if (str1.charAt(i) == 'x' && str2.charAt(i) == 'y') {
			a++;
		} else if (str1.charAt(i) == 'y' && str2.charAt('x')){
			b++;
		}
		
		if((a + b) % 2 == 0) {
			res = a/2 + b/2 + 2*（a%2）;
		}else {
			return -1;
		}
		return res;	
	}	
}