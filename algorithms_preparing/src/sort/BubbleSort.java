package sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		Comparable[] arr = { 126, 272, 8, 165, 123, 12, 28 }; // default value
		BubbleSort bs = new BubbleSort();
		BubbleSort.sort(arr, arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	// 从小到大
	public static void sort(Comparable[] arr, int length) {
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1])>0) {
					swap(arr,j, j + 1);
				}
			}
	}

	private static void swap(Comparable[] arr, int x, int y) {
		Comparable temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
