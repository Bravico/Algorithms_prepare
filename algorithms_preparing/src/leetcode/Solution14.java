package leetcode;

public class Solution14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution14 so = new Solution14();
		//System.out.println(so.longestCommonPrefix(new String[]{"22","222","223","221"}));
		System.out.println(so.longestCommonPrefix(new String[]{"aa","ab"}));
	}

	public String longestCommonPrefix(String[] strs) {
		String newStr = "";
		if(strs.length==0) return newStr;
		char c = '\0';
		int minLength = Integer.MAX_VALUE;
		for (String ss : strs) {
			if (ss.length() < minLength)
				minLength = ss.length();
		}
		for (int i = 0; i < minLength; i++){
			for (int j = 0; j<strs.length;j++) {
				String ss = strs[j];
				if (ss.length() == 0) return newStr;
				if (c == '\0') c = ss.charAt(0);
				if (c != ss.charAt(0)) return newStr;
				System.out.println(ss);
				strs[j] = strs[j].substring(1);
			}
			newStr += c;
			c = '\0';
		}
		return newStr;
	}
	
	public String longestCommonPrefix2(String[] strs) {
		if(strs.length ==0 ) return "";
		String prefix = strs[0];
		for(int i =1; i< strs.length; i++){
			while(strs[i].indexOf(prefix)!=0){
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}

}
