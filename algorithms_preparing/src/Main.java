import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int p1, p2, p3;
		String testStr = "";
		while (scan.hasNext()) {
			String s = scan.nextLine();
			if (s.length() == 0) {
				System.out.println("ERROR");
			} else {
				// not null String
				String[] ss = s.split(" ");
				if (ss.length != 4) {
					System.out.println("ERROR");
				} else {
					try {
						testStr = ss[0];
						p1 = Integer.parseInt(ss[1]);
						p2 = Integer.parseInt(ss[2]);
						p3 = Integer.parseInt(ss[3]);
						System.out.println(tryMySolution(testStr, p1, p2, p3));
					} catch (NumberFormatException e) {
						System.out.println("ERROR");
					}
				}
			}
		}
	}

	// solution
	public static String tryMySolution(String str, int p1, int p2, int p3) {
		String[] ss = str.split("-");
		String newStr = ss[0];

		if (ss.length != 2)
			return "ERROR"; // not "-" or too much '-'
		else {
			// contains '-'
			String ss1 = ss[0];
			char c1 = ss1.charAt(ss1.length() - 1);
			String ss2 = ss[1];
			char c2 = ss2.charAt(0);
			// 并且按照ASCII码的顺序，减号右侧的字符严格大于左侧的字符。
			if (c1 >= 97 && c1 <= 122 && c2 >= 97 && c2 <= 122 && c2 > c1) {
				// from A-z,can use regex
				Stack stack = new Stack<>();
				// may need to revised,a and A conditions
//				newStr += ss[0];
				// p1,p2,p3
				switch (p1) {
				case 1:
					// 小写
					if (p2 == 1) {
						if (p3 == 1) {
							// in-order,copy1,from small to large
							for (int i = 1; i < c2 - c1; i++)
								newStr += (char)(c1 + i);
						}else if(p3==2){
							//dis-order
							for (int i = 1; i < c2 - c1; i++)
								newStr += (char)(c2 - i);
						}else return "ERROR";
					}else if(p2 ==2){
						//copy twice
						if(p3 == 1){
							for (int i = 1; i < c2 - c1; i++){
								newStr += (char)(c1 + i);
							    newStr += (char)(c1 + i);
							}
						}else if(p3==2){
							for (int i = 1; i < c2 - c1; i++){
								newStr += (char)(c2 - i);
								newStr += (char)(c2 - i);
							}
						}else return "ERROR";
					}else return "ERROR";
					break;
				case 2:
					if (p2 == 1) {
						if (p3 == 1) {
							// in-order,copy1,from small to large
							for (int i = 1; i < c2 - c1; i++)
								newStr += (char)(c1 + i - 32);
						}else if(p3==2){
							//dis-order
							for (int i = 1; i < c2 - c1; i++)
								newStr += (char)(c2 - i-32);
						}else return "ERROR";
					}else if(p2 ==2){
						//copy twice
						if(p3 == 1){
							for (int i = 1; i < c2 - c1; i++){
								newStr += (char)(c1 + i-32);
							    newStr += (char)(c1 + i-32);
							}
						}else if(p3==2){
							for (int i = 1; i < c2 - c1; i++){
								newStr += (char)(c2 - i-32);
								newStr += (char)(c2 - i-32);
							}
						}else return "ERROR";
					}else return "ERROR";
					break;
				case 3:
					if (p2 == 1) {
						if (p3 == 1) {
							// in-order,copy1,from small to large
							for (int i = 0; i < c2 - c1; i++)
								newStr += "*";
						}else if(p3==2){
							//dis-order
							for (int i = 0; i < c2 - c1; i++)
								newStr += "*";
						}else return "ERROR";
					}else if(p2 ==2){
						//copy twice
						if(p3 == 1){
							for (int i = 0; i < c2 - c1; i++){
								newStr += "*";
							    newStr += "*";
							}
						}else if(p3==2){
							for (int i = 0; i < c2 - c1; i++){
								newStr += "*";
								newStr += "*";
							}
						}else return "ERROR";
					}else return "ERROR";
					break;
				default:
					return "ERROR";
				}
			} else if (c1 >= 48 && c1 <= 57 && c2 >= 48 && c2 <= 57 && c2 > c1) {
				// number from '0'-'9'
				int n1 = c1 - '0';
				int n2 = c2- '0';
				Stack stack = new Stack<>();
				if(p1==1 || p1 ==2){
					//number
					if(p2==1){
						if(p3==1){
							for (int i = 1; i < c2 - c1; i++)
								newStr += (n1 + i);
						}else if(p3==2){
							for (int i = 1; i < c2 - c1; i++)
								stack.push(n1+i);
							while(!stack.empty()) newStr +=stack.pop();
							stack.empty();
						}else return "ERROR";
					}else if(p2 ==2){
						if(p3==1){
							for (int i = 1; i < c2 - c1; i++){
								newStr += (n1 + i);
							    newStr += (n1 + i);
							}
						}else if(p3==2){
							for (int i = 1; i < c2 - c1; i++){
								stack.push(n1+i);
								stack.push(n1+i);
							}
							while(!stack.empty()) newStr +=stack.pop();
//							stack.empty();
						}else return "ERROR";
					}else return "ERROR";
				}else if(p1 ==3){
					//*
					if(p2==1){
						if(p3==1 || p3 ==2){
							for (int i = 1; i < c2 - c1; i++)
								newStr += "*";
						}else return "ERROR";
					}else if(p2 ==2){
						if(p3==1 || p3 == 2){
							for (int i = 1; i < c2 - c1; i++){
								newStr += "*";
								newStr += "*";
							}
						}else return "ERROR";
					}else return "ERROR";
				
				}else return "ERROR";
			} else return "ERROR";
			newStr +=ss[1];
		}

		return newStr;
	}

}
