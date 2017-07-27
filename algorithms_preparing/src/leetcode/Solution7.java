package leetcode;

import java.util.Stack;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1000000003));
	}

	public static int reverse(int x) {
		String s = x + "";
		int n = 0;
		Stack stack = new Stack();
		String newStr = "";
		if (s.charAt(0) == '-') {
			for (int i = 1; i < s.length(); i++)
				stack.push(s.charAt(i));
			newStr += '-';
		} else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
			for (int i = 0; i < s.length(); i++)
				stack.push(s.charAt(i));
		} else
			return 0;

		while (!stack.empty())
			newStr += stack.pop();
		try {
			n = Integer.parseInt(newStr);
		} catch (NumberFormatException e) {
			return 0;
		}
		return n;
	}

}
