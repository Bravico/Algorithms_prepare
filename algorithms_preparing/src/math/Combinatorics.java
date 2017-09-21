package math;

/**
 * Combinatorics C and A
 * 
 * @author Yel
 *
 */
public class Combinatorics {

	public static void main(String[] args) {
		System.out.println(getA(5, 6));
	}

	/**
	 * get result of C n m
	 * 
	 * @param n
	 *            larger value
	 * @param m
	 *            smaller value
	 * @return return a double type in case decimal fraction 
	 */
	public static double getC(int n, int m) {
		if(n<m) throw new ArithmeticException();
		int a = 1, b = 1;
		for (int i = 0; i < m; i++) {
			a *= (n - i);
			b *= (m - i);
		}
		return (double) a / (double) b;
	}
	
	/**
	 * get result of A n m
	 * @param n larger value
	 * @param m smaller value
	 * @return return a long type in case Precision overflow
	 */
	public static long getA(int n, int m) {
		if(n<m) throw new ArithmeticException();
		long sum = 1;
		for(int i=0;i<m; i++) sum *= (n-i);
		return sum;
	}
}
