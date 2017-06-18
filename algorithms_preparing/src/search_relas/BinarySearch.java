package search_relas;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,5,8,10,15,34,68};
		Arrays.sort(a);
		System.out.println(rank(5, a));
		System.out.println(rank(12, a));
	}

	/**
	 * The array obeys small-to-large order
	 * 
	 * @param key
	 * @param a
	 * @return
	 */
	private static int rank(int key, int[] a) {
		int lo = 0;
		int ro = a.length - 1;
		int mid=0;
		while (lo <= ro) {
			mid = (lo + ro) / 2;
			if (key < a[mid]) {
				ro = mid - 1;
			}else if(key >a[mid]){
				lo = mid +1;
			}else if(key == a[mid]){
				return mid;
			}
		}
		//not found the key
		return -1;
	}

}
