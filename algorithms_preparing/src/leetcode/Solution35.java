package leetcode;

import java.util.Arrays;

public class Solution35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int searchInsert(int[] nums, int target) {
		int n = Arrays.binarySearch(nums, target);
		return (n >= 0 ? n : (-n) - 1);
	}
}
