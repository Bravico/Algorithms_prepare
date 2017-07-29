package leetcode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * @author Yel
 *
 */
public class Solution21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(1);
		ListNode helper = new ListNode(2);
		l2.next = helper;
		helper.next = new ListNode(4);
		// [1,2,4]
		System.out.println(mergeTwoLists(l1, l2));

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode n1 = l1, n2 = l2;
		ListNode root;
		ListNode nextNode;
		if (l1 == null && l2 == null)
			return null;
		else if (l1 == null || l2 == null) {
			if (l1 == null)
				root = l2;
			else
				root = l1;
		} else {
			if (n1.val > n2.val) {
				root = new ListNode(n2.val);
				n2 = n2.next;
			} else {
				root = new ListNode(n1.val);
				n1 = n1.next;
			}
			nextNode = root;
			while (n1 != null && n2 != null) {
				if (n1.val > n2.val) {
					nextNode.next = new ListNode(n2.val);
				} else {
					nextNode.next = new ListNode(n1.val);
				}
				nextNode = nextNode.next;
			}
			if (n1 != null)
				nextNode.next = n1;
			else if (n2 != null)
				nextNode.next = n2;
		}
		return root;
	}

	public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		ListNode helper = new ListNode(0);
		ListNode pre = helper;
		helper.next = l1;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				ListNode next = l2.next;
				l2.next = pre.next;
				pre.next = l2;
				l2 = next;
			} else {
				l1 = l1.next;
			}
			pre = pre.next;
		}
		if (l2 != null) {
			pre.next = l2;
		}
		return helper.next;
	}
	public static ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
		ListNode helper = new ListNode(0); //init point
		ListNode pre = helper;
		helper.next = l1;
		while(l1!=null && l2!=null){
			if(l1.val>l2.val){
				//put l2 first
				//pre --->l1 ////  pre --->l2 ----->l1 || pre.next = 
				ListNode node = l2.next;
				l2.next = pre.next;
				pre.next = l2;
				l2 = node;
			}else{
				l1 = l1.next;
			}
			pre = pre.next;
		}
		if(l2!=null){
			pre.next = l2;
		}
		return helper.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
