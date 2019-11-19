package leetcode;

public class Solution110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBalanced(TreeNode root) {
		if(root == null) return true;
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		return (Math.abs(right-left)<2 && isBalanced(root.left) && isBalanced(root.right));
	}
	
	public int getHeight(TreeNode node) {
		if(node==null) return 0;
		int left = getHeight(node.left);
		int right = getHeight(node.right);
		return 1 + (left>right?left:right);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
