package sort;

public class BubbleSort {
	int[] arr = { 126, 272, 8, 165, 123, 12, 28 }; // default value

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bs = new BubbleSort();
		bs.bubblesort(bs.arr, bs.arr.length);
		for(int i=0;i<bs.arr.length;i++)
			System.out.println(bs.arr[i]);
	}

	// 从小到大
	public void bubblesort(int[] arr, int length) {
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1);
				}
			}
	}

	private void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
