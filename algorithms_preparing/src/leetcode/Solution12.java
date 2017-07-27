package leetcode;

import java.util.Stack;

/**
 * Integer to Roman numeral
 * @author Yel
 * notes:
 * newStr = roman[digit][remain]+newStr;
 * 这个可以将字符串加在后面，避免了使用Stack更加麻烦
 */
public class Solution12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(1994));
	}
    public static String intToRoman(int num) {
    	String newStr = "";
        String[][] roman = {  
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
                {"", "M", "MM", "MMM"}  
            }; 
        int remain = 0;
        int digit = 0;
        while(num!=0){
        	remain = num %10; //个位
        	newStr = roman[digit][remain]+newStr;
        	digit++;
        	num /=10; 
        }
        return newStr;
    }
}
