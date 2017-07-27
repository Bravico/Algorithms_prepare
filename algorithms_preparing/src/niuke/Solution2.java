package niuke;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = "";
		char c ='\0';
		while(scanner.hasNext()){
			String s = scanner.nextLine();
			if(s.length()>1){
				//first line
				string +=s;
			}else{
				if(string.length()==0 || c=='\0') System.out.println();
				else{
					c = s.charAt(0);
					System.out.println(getNum(string, c));
					string = "";
					c ='0';
				}
			}
		}
		
	}
	
	public static int getNum(String s, char c){
		String b = c+"";
		if(b.length()==0) return 0;
		else{
			int n = 0;
			for(int i=0; i<s.length();i++){
				String a = new String(s.charAt(i)+"");
				
				if(b.equalsIgnoreCase(a)){
					n++;
				}
			}
			return n;
		}
		
	}

}
