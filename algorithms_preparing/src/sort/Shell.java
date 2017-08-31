package sort;

public class Shell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {126,272,8,165,123,12,28}; //default value
		Shell.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3) h = h * 3 + 1;
		while(h>=1){
			for(int i= h;i<N;i++){
				for(int j=i; j>=h && (a[j].compareTo(a[j-h])<0);j--)
					swap(a,j,j-h);
			}
			h = h/3;
		}
	}
	private static void swap(Comparable[] arr,int x, int y) {
		Comparable temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
