package string_relas;

import java.util.HashSet;
import java.util.Set;

/**
 * try to implement the slide window algorithms and normal one.
 * The question shows below
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description
 * @author Yel
 *
 */
public class RepeatChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++)
			for (int j = i + 1; j <= s.length(); j++)
				if (allUnique(s, i, j))
					ans = Math.max(ans, j - 1);
		return ans;
	}

	private static boolean allUnique(String s, int start, int end) {
		HashSet<Character> sets = new HashSet<>();
		for (int i = start; i < end; i++) {
			if (sets.contains(s.charAt(i)))
				return false;
			sets.add(s.charAt(i));
		}
		return true;
	}
	
	/**
	 * slide window strategy
	 * @param s
	 * @return
	 */
	public static int slideWin(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			if(set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				ans = Math.max(ans, j-1);
			}else{
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
}
