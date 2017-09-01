package sort;

import java.util.Arrays;

public class MergeSort {
//	private static Comparable[] aux; //revise the aux object to a function variable
	public static void main(String[] args) {
		Integer[] arr = {126,272,8,165,123,12,28}; //default value
		Shell.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void merge(Comparable[] a,int lo, int mid, int hi){
		Comparable[] aux;
		int i =lo, j = mid +1;
		aux = Arrays.copyOfRange(a,lo,hi);
		for(int k=lo; k<=hi;k++){
			if(i>mid) a[k] = aux[j++];
			else if(j>hi) a[k] = aux[i++];
			else if(aux[j].compareTo(aux[i])>0) a[k] = aux[i++];
			else a[k] = aux[j++];
		}
	}
	public static void sort(Comparable[] a){
//		aux = new Comparable[a.length];
		sort(a,0,a.length-1);
	}
	private static void sort(Comparable[] a,int lo, int hi){
		if(hi<=lo) return;
		int mid = lo + (hi-lo)/2;
		sort(a,lo,mid);
		sort(a,mid+1,hi);
		merge(a, lo, mid, hi);
	}
}
