package leetcode;
/**
 * 回文算法，由于有三重循环，在长字符串的时候效率偏低
 * Notes:使用substring()函数的时候需要非常小心，它的endIndex是不包括在里面的。。之前就遇到过，但是没有记住
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"
Output: "bab"

Note: "aba" is also a valid answer.
Example:
Input: "cbbd"
Output: "bb"

 * @author Yel
 *
 */
public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 s5 = new Solution5();
		String string = new String("lcnvoknqgejxbfhijmxglisfzjwbtvhodwummdqeggzfczmetrdnoetmcydwddmtubcqmdjwnpzdqcdhplxtezctvgnpobnnscrmeqkwgiedhzsvskrxwfyklynkplbgefjbyhlgmkkfpwngdkvwmbdskvagkcfsidrdgwgmnqjtdbtltzwxaokrvbxqqqhljszmefsyewwggylpugmdmemvcnlugipqdjnriythsanfdxpvbatsnatmlusspqizgknabhnqayeuzflkuysqyhfxojhfponsndytvjpbzlbfzjhmwoxcbwvhnvnzwmkhjxvuszgtqhctbqsxnasnhrusodeqmzrlcsrafghbqjpyklaaqximcjmpsxpzbyxqvpexytrhwhmrkuybtvqhwxdqhsnbecpfiudaqpzsvfaywvkhargputojdxonvlprzwvrjlmvqmrlftzbytqdusgeupuofhgonqoyffhmartpcbgybshllnjaapaixdbbljvjomdrrgfeqhwffcknmcqbhvulwiwmsxntropqzefwboozphjectnudtvzzlcmeruszqxvjgikcpfclnrayokxsqxpicfkvaerljmxchwcmxhtbwitsexfqowsflgzzeynuzhtzdaixhjtnielbablmckqzcccalpuyahwowqpcskjencokprybrpmpdnswslpunohafvminfolekdleusuaeiatdqsoatputmymqvxjqpikumgmxaxidlrlfmrhpkzmnxjtvdnopcgsiedvtfkltvplfcfflmwyqffktsmpezbxlnjegdlrcubwqvhxdammpkwkycrqtegepyxtohspeasrdtinjhbesilsvffnzznltsspjwuogdyzvanalohmzrywdwqqcukjceothydlgtocukc");
		System.out.println(s5.longestPalindrome(string));
	}
	//最长的回文
    public String longestPalindrome(String s) {
        String longestStr = "";
        int length = 0;
        if("".equals(s)) return null;
        else if(s.length()==1) return s;
        else{
            longestStr += s.charAt(0); // in case no Palindrome
           for(int i=0;i<s.length()-1;i++)
            for(int j = i+1;j<s.length();j++){
                String ss = s.substring(i,j+1); //bb
                if(isPalindrome(ss)) { 
                    int len = j-i+1; //2
                    if(len>length) { //没等于,取第一个
                        longestStr = ss;
                        length = len;
                    }
                }
            } 
        }
        return longestStr;
    }
    public boolean isPalindrome(String s){
        char cl,cr;
        if(s.length()%2==0){
            //even number.
            for(int i=0,j=s.length()-1;i<j;i++,j--)
                if(s.charAt(i) != s.charAt(j)) return false;
        }else{
            //odd number,has one char in the middle
            for(int i=0,j=s.length()-1;i<j;i++,j--){
                if(i==j) return true;
                if(s.charAt(i) != s.charAt(j)) return false;
            }
        }
        return true;
        // cl = s.charAt(0);
        
    }
}
