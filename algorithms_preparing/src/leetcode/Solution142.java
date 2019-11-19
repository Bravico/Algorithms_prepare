package leetcode;

public class Solution142 {

	public static void main(String[] args) {
		

	}
	
	  public ListNode detectCycle(ListNode head) {
	        
	        //快慢链表形式
	    	if(head ==null || head.next==null) return null;
	        
	        ListNode slow = head.next;
	        ListNode fast = slow.next;
	        
	        while(fast!=null && fast.next!=null) {
	            //还没走到尽头
	            slow = slow.next;
	        	fast = fast.next.next;
	        	if(fast==slow) {          
	        		//相等，说明有环
	                slow = head;
	                while (slow != fast) {
	                    slow = slow.next;
	                    fast = fast.next;
	                }
	                return slow;
	        	}
	        }
	        //走到尽头
	        return null; 
	    }

    

}
