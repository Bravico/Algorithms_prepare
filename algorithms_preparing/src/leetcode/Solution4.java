package leetcode;

/**
 * 
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
import java.util.Stack;
/**
 * not finished. 由于其中的有些判断条件没有想清楚，在写之前忽略了{1}，{2，3，4}的情况，所以还是得先起个函数建立新的有序数组
 * @author Yel
 *
 */

public class Solution4 {
	public static void main(String[] args){
		Solution4 so = new Solution4();
		int[] a,b;
		a = new int[]{1};
		b = new int[]{2,3,4};
		System.out.println(so.findMedianSortedArrays(a,b));
	}
	/**
	 * use binarysearch to get number, in terms of the time complexity
	 * requirement is O(log(m+n))
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		if (m == 0 && n == 0) {
			return 0;
		} else if (m == 0 || n == 0) {
			if (m != 0) {
				int[] a1 = binarySearch(nums1, m);
				if (a1.length == 1)
					return a1[0];
				else
					return (double) (a1[0] + a1[1]) / 2;
			} else {
				int[] a2 = binarySearch(nums2, n);
				if (a2.length == 1)
					return a2[0];
				else
					return (double) (a2[0] + a2[1]) / 2;
			}
		} else {
			int[] a1 = binarySearch(nums1, m);
			int[] a2 = binarySearch(nums2, n);
			if (m % 2 == 0 && n % 2 == 0) {
				if(m!=n){
					//长度不对称
					
				}else{
					// even number, which shows that 4 numbers will be needed
					if (a1[1] <= a2[0])
						return (double) (a1[1] + a2[0]) / 2;
					else if (a1[1] >= a2[1])
						return (double) (a2[0] + a2[1]) / 2;
					else if (a1[1] < a2[1])
						return (double) (a1[1] + a2[0]) / 2;


					if (a2[1] <= a1[0])
						return (double) (a2[1] + a1[0]) / 2;
					else if (a2[1] >= a1[1])
						return (double) (a1[0] + a1[1]) / 2;
					else if (a1[1] < a2[1])
						return (double) (a2[1] + a1[0]) / 2;
				}


			} else if (m % 2 == 0 || n % 2 == 0) {
				// odd number
				int x = a1[0], y = a2[0], z;
				if (m % 2 == 0) {
					// a1 odd
					z = a1[1];
					if (z < y)
						return z;
					else if (x > y)
						return x;
					else if (x <= y)
						return y;
				} else if (n % 2 == 0) {
					z = a2[1];
					if (z < x)
						return z;
					else if (y > x)
						return y;
					else if (y <= x)
						return x;
				}

			} else if (m % 2 != 0 && n % 2 != 0) {
				return (double) (a1[0] + a2[0]) / 2;
			}
		}
		return 0;
	}

	public int[] binarySearch(int[] nums, int len) {
		if ((len - 1) % 2 == 0) {
			// odd
			return new int[] { nums[(len - 1) / 2] };
		} else {
			return new int[] { nums[(len - 1) / 2], nums[(len - 1) / 2 + 1] };
		}
	}
	
//	public Stack 

}
