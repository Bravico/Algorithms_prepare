package niuke;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
/**
 * find out how to use TreeMap and TreeSet,use 红黑树
 * @author Yel
 *
 */


public class Solution3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int isFirstLine = 0;
		int n = 0;
		int[] array;
		TreeSet<Integer> ts = new TreeSet<>();
		while (scan.hasNext()) {
			n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				ts.add(scan.nextInt());
			}
			for (Integer i: ts)
				System.out.println(i);
		}

	}

	/*public static int[] getSortedArray(int[] inputArray, int n) {
		// has remove repeated values,then sort
		return quickSort(inputArray, 0, inputArray.length - 1);
	}

	public static int[] quickSort(int[] inputArray, int start, int end) {
		int pivot = inputArray[inputArray.length - 1];
		int left = start;
		int right = end;
		while (left < right) {
			if (inputArray[left] < pivot && left < right)
				left++;
			if (inputArray[right] > pivot && left < right)
				right--;
			swap(left, right, inputArray);
		}
		// left == right
		if (inputArray[left] >= pivot)
			swap(left, end, inputArray);
		quickSort(inputArray, 0, left);
		quickSort(inputArray, left + 1, end);
		return inputArray;
	}

	public static void swap(int a, int b, int[] ay) {
		int temp = ay[a];
		ay[a] = ay[b];
		ay[b] = temp;
	}*/
}
