package leetcode;

/**
 * 题目给的定义太不清楚了，加的一位加在后面，还有两个串不相等的情况也没有列出来，题目还是不够详细，这个题目不推荐
 * 这个题目我之前也想过用一个消极的头来连接，但是题目中必须要用反序导致我迷糊了不知道那个8是（3+4+1）还是（2+5+1）感觉写了很久，而且写的很乱=。=
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
import java.util.ArrayDeque;
import java.util.HashMap;

public class Solution2 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int add = 0;
	        HashMap map1 = new HashMap();
	        HashMap map2 = new HashMap();
	        ListNode m1,m2;
	        m1 = l1; m2 = l2;
	        int i = 0;
	        while(m1!=null || m2!=null){
	            if(m1==null) map1.put(i,0);
	            else{
	                map1.put(i,m1.val);
	                m1 = m1.next;
	            }
	            if(m2==null) map2.put(i,0);
	            else{
	                map2.put(i,m2.val); 
	                m2 = m2.next;
	            }
	            i++;
	        }
	        //create a new ListNode
	        ArrayDeque<ListNode> s = new ArrayDeque<ListNode>();
	        for(int j=0;j<map1.keySet().size();j++){
	            int v1 = (Integer)map1.get(j);
	            int v2 = (Integer)map2.get(j);
	            int sum = 0;
	            if(add==1) {
	                sum = v1+v2+1;
	                add = 0;
	            }else{
	               sum = v1+v2; 
	            }
	            if(sum>=10){
	                sum -= 10;
	                add = 1;
	            }
	            ListNode node = new ListNode(sum);
	            s.add(node);
	        }
	        if(add==1){
	           //still equals 1
	            ListNode node = new ListNode(add);
	            s.add(node);
	            add = 0;
	        } 
	            
	        ListNode root = (ListNode)s.remove();
	        if(s.isEmpty()!=true){
	            root.next = s.element();
	        }

	        while(s.isEmpty()!=true){
	            //has value in stack
	            ListNode n = s.remove();
	            if(s.isEmpty()!=true) n.next = s.element();
	            else n.next = null;
	        }
	        m1 = root;
	        while(m1!=null){
	            System.out.print(m1.val);
	            if(m1.next!=null) System.out.print("->");
	            m1= m1.next;
	        }
	      return root;  
	    }
	}
}
