package leetcode;

public class Solution461 {
	public static void main(String[] args){
		System.out.println(hammingDistance(4,2));
	}
	public static int hammingDistance(int x, int y) {
        //异或
//        String s1 = Integer.toBinaryString(x);
//        String s2 = Integer.toBinaryString(y);
        String s3=Integer.toBinaryString(x^y);
//        System.out.println(s3.lastIndexOf("1"));
         if(s3.lastIndexOf("1")==s3.indexOf("1")) {
        	 if(s3.length() ==1) return 1;
        	 else return s3.length()-1-s3.indexOf("1");
         }else return s3.lastIndexOf("1")-s3.indexOf("1");
    }
}
