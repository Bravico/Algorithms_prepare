package leetcode;

/**
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * @author Yel
 *
 */
public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] twoSum(int[] nums, int target) {
	       for(int i=0;i<nums.length;i++){
	           for(int j=0;j<nums.length;j++){
	               int sum = nums[i]+nums[j];
	               if(i==j) continue;
	               else if(sum == target) return new int[]{i,j};
	           }
	       }
		return null;
	    }
}
