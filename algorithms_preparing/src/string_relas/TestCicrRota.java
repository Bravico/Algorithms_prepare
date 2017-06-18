package string_relas;

public class TestCicrRota {

	/*
	 * ACTGACG ---> TGACGAC
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "ACTGACG";
		String string2 = "TGACGAC";
		judgeCicr(string1, string2);
	}
	private static boolean judgeCicr(String s1,String s2){
		if(s1.concat(s1).indexOf(s2) == -1){
			return false;
		}else{
			return true;
		}
	}
}
