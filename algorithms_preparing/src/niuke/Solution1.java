package niuke;

import java.util.Scanner;

public class Solution1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Solution1 solu = new Solution1();
		while (scan.hasNext()) {
			String str = scan.nextLine();
			System.out.println(solu.getLastLength(str));
		}
	}

	public int getLastLength(String s) {
		if (s.length() != 0) {
			String[] as = s.split(" ");
			return as[as.length - 1].length();
		} else
			return 0;

	}
}
