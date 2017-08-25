package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ll = new LinkedList<List<Integer>>();
        if(nums.length<3) return ll;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int left = i+1, right = nums.length-1, sum = 0 - nums[i];
                while(left<right){
                    if(nums[left]+nums[right] == sum) {
                        ll.add(Arrays.asList(nums[left],nums[right],nums[i]));
                        //考虑重复的情况
                        while(left<right && nums[left] == nums[left+1]) left++;
                        while(left<right && nums[right] == nums[right-1]) right--;
                        left++;right--;
                    }
                    else if (nums[left]+nums[right] > sum) right--;
                    else left++;
                }
            }
        }
        return ll;
    }

}
