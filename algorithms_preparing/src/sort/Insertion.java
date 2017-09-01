package sort;

public class Insertion {

	public static void main(String[] args) {
		Integer[] arr = {126,272,8,165,123,12,28}; //default value
		Insertion.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	
	}

	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 1; i < N; i++) {
			for (int j = i; j > 0 && a[j].compareTo(a[j-1]) < 0; j--) {
				swap(a, j, j-1);
			}
		}
	}
	
	private static void swap(Comparable[] arr,int x, int y) {
		Comparable temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
