package leetcode;
/**
 * 
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
Example 1:
    2
   / \
  1   3
Binary tree [2,1,3], return true.
Example 2:
    1
   / \
  2   3
Binary tree [1,2,3], return false.
 * @author Yel
 *
 */

public class Solution98 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		else
			return isValidBST_recur(root, Long.MIN_VALUE, Long.MAX_VALUE);
		// if i use Integer.MIN_VALUE, it cannot pass,I don't know the reason
	}

	public boolean isValidBST_recur(TreeNode root, long min_val, long max_val) {
		if (root == null)
			return true;
		if (root.val < max_val && root.val > min_val) {
			return isValidBST_recur(root.left, min_val, root.val) && isValidBST_recur(root.right, root.val, max_val);
		} else {
			return false;
		}

	}

}
