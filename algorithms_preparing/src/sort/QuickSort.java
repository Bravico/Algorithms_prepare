package sort;
//将最后一个数作为pivot基准

public class QuickSort {
	int[] arr = {126,272,8,165,123,12,28}; //default value

	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {126,272,8,165,123,12,28}; //default value
		QuickSort qs = new QuickSort();
		qs.setArr(arr);
		qs.quickSort_2(0, arr.length-1);
		
		for(int i=0;i<qs.arr.length;i++)
			System.out.println(qs.arr[i]);
	}
    /**
     * from small to large
     * @param start
     * @param end
     */
	public int[] quickSort(int start, int end){
		if(start>=end) return arr;
		int mid = arr[end];
		int left = start;
		int right = end -1;
//		int i,j;
		while (left < right){
			while(mid>=arr[left] && left < right)
				left++;
			while(mid<=arr[right] && left < right)
				right--;
			
			swap(left, right);
		}
		if (arr[left] >= arr[end])
			swap(left,  end);
		//divide into smaller part
		quickSort(start, left-1 );
		quickSort(left, right);
		return arr;
	}
	//从大到小排列
	public void quickSort_2(int start, int end){
		if(start>=end) return;
		int mid = arr[end];
		int left = start;
		int right = end -1;
		while(left<right){
			while(arr[left]>=mid && left<right)
				left++;
			while(arr[right]<=mid && left<right)
				right--;
			swap(left, right);
		}
		if(arr[end]>arr[left]) 
			swap(left, end);
		quickSort_2(start,left-1);
		quickSort_2(left, right);
	}

	private void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	private void quick_sort_recursive(int start, int end) {
		if (start >= end) // the swap is in the end
			return;
		int mid = arr[end];
		int left = start, right = end - 1;
		while (left < right) {
			while (arr[left] <= mid && left < right)
				left++;
			while (arr[right] >= mid && left < right)
				right--;
			swap(left, right);
		}
		if(arr[left]>arr[end])
			swap(left, end);
		quick_sort_recursive(start, left - 1);
		quick_sort_recursive(left, end);
	}
}
