package leetcode;

import java.util.Stack;

/**
 * 
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author Yel
 *
 */
public class Solution20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }else if(c == '}' || c == ']' || c == ')'){
                if(!stack.empty()) {
                    char c1 = (char)stack.pop();
                    if(c=='}' && c1=='{') continue;
                    else if(c==']' && c1=='[') continue;
                    else if(c==')' && c1=='(') continue;
                    else return false;
                }else return false;
                
            }
        }
        if(!stack.empty()) return false;
        else return true;
    }
}
