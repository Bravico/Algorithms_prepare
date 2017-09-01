package sort;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {126,272,8,165,123,12,28}; //default value
		Selection.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	
	}
	
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i=0;i<N;i++){
			int min = i;
			for(int j=i+1; j<N; j++){
				if(a[min].compareTo(a[j])>0) min = j;
			}
			swap(a, i, min);
		}
	}
	
	private static void swap(Comparable[] arr,int x, int y) {
		Comparable temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
