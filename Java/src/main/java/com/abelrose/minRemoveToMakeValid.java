/**
*
*  Fun: minRemoveToMakeValid
*
*  Des: 移除无效的括号
*
*  Author: @sunyihao
*
*/

class Main {
	public String minRemoveToMakeValid(String s) {
		
		Stack<Integer> stack = new Stack<>();
		boolean[] inValidIdx = new boolean[s.length()];
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
				inValidIdx[i] = true;
			}
			if (s.charAt(i) == ')') {
				if (stack.isEmpty()) {
					inValidIdx[i] = true;
				}
			} else {
				inValidIdx[stack.pop(i)] = false;
			}
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(!inValidIdx[i]) {
				res.append(s.charAt(i));
			}
		}
		return res.toSting();
	}
}