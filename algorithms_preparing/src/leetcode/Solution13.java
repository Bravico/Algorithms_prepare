package leetcode;
/**
 * 罗马数字转换成数字
 * @author Yel
 *
 */
public class Solution13 {
//MCMXC, 1990
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMXC"));
	}

	public static int romanToInt(String s) {
		int cap = toNumber(s.charAt(0));
//		int n =0;
		for(int i=1;i<s.length();i++){
			if(toNumber(s.charAt(i-1))<toNumber(s.charAt(i))){
				cap +=toNumber(s.charAt(i)) - 2*toNumber(s.charAt(i-1));
			}else{
				cap += toNumber(s.charAt(i));
			}
		}
		return cap;
	}

	public static int toNumber(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}
}
