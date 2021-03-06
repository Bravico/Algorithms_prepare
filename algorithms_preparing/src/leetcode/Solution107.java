package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 * @author Yel
 *
 */
public class Solution107 {
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> lli = new LinkedList<>();
    	Stack<List<Integer>> st = new Stack<>();
    	Queue<TreeNode> queue = new LinkedList<>();
    	if(root==null) return lli;
        
    	queue.offer(root);
    	while(queue.size()!=0){
    		int len = queue.size();
    		List<Integer> list = new LinkedList<>();
    		for(int i=0;i<len;i++){
        		TreeNode tn = queue.poll();
        		if(tn.left!=null) queue.offer(tn.left);
        		if(tn.right!=null) queue.offer(tn.right);
        		list.add(tn.val);
    		}
    		st.push(list);
    	}
    	while(!st.isEmpty()) lli.add(st.pop());
    	return lli;
    }
}
