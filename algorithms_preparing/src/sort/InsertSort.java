package sort;

public class InsertSort {
	
	int[] arr = { 126, 272, 8, 165, 123, 12, 28 }; // default value
	
	public static void main(String args[]){
		int[] arr = { 126, 272, 8, 165, 123, 12, 28 }; // default value
		InsertSort is = new InsertSort();
		is.insertsort(is.arr);
		for(int i=0;i<is.arr.length;i++)
			System.out.println(is.arr[i]);
	}
	
	public void insertsort(int[] arr){
		// 从第二个到最后一个数，逐个插入
		for(int i=1;i<arr.length;i++){
			// 每个数要和前面已经有序的数进行比较
			int j;
			for(j=i-1;j>=0;j--){
				if(arr[i]>arr[j]) break;
			}
			// put the number in right location, move larger number one by
			// one
			int temp = arr[i];
			for(int n = i-1;n>j;n--){
				//move the nums
				arr[n+1] = arr[n];
			}
			//finally, put temp to nums[j]
			arr[j+1] = temp;
		}
		
	}
	
	private void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	private static void insertSort(int[] nums) {
		// 从第二个到最后一个数，逐个插入
		for (int i = 1; i < nums.length; i++) {
			// 每个数要和前面已经有序的数进行比较
			int j;
			for (j = i - 1; j >=0; j--) {
				if (nums[j] < nums[i]) {
					break;
				}
			}
	
			// put the number in right location, move larger number one by
			// one
			int temp = nums[i];
			for(int n = i-1;n>j;n--){
				//move the nums
				nums[n+1] = nums[n];
			}
			//finally, put temp to nums[j]
			nums[j+1] = temp;
		}
	}
}
