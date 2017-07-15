package leetcode;
/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution3 {
	public int lengthOfLongestSubstring(String s) {
        int w1=0, w2=0;
        int num_string = 1;
        // char[] cs;
        if(s.isEmpty()) return 0;
        // cs = s.toCharArray();
        
        for(int i = 0;i< s.length()-1;i++){
            ArrayList al = new ArrayList();
            al.add(s.charAt(i));
            for(int j = i+1;j< s.length();j++){
                int num = j-i+1;
                if(al.contains(s.charAt(j)) ) break;
                else if(num>num_string){
                    num_string = num;
                }
                al.add(s.charAt(j));
            }
        }
              
        return num_string;
    }
    
    // private boolean isRepeat(char[] cs, int start, int end){
    //     ArrayList al = new ArrayList();
    //     for(int i=start;i<=end;i++){
    //         if(al.contains(cs[i])) return true;
    //         else al.add(cs[i]);
    //     }
    //     return false;
    // }
	 public int lengthOfLongestSubstring2(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
		    public int lengthOfLongestSubstring3(String s) {
		        int n = s.length();
		        Set<Character> set = new HashSet<>();
		        int ans = 0, i = 0, j = 0;
		        while (i < n && j < n) {
		            // try to extend the range [i, j]
		            if (!set.contains(s.charAt(j))){
		                set.add(s.charAt(j++));
		                ans = Math.max(ans, j - i);
		            }
		            else {
		                set.remove(s.charAt(i++));
		            }
		        }
		        return ans;
		    }
}
