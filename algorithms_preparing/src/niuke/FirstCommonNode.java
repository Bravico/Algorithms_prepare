package niuke;

import java.util.Stack;

public class FirstCommonNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
 		if(pHead1==null || pHead2==null) return null;
        if(pHead1==pHead2){
            return pHead1;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while(p1!=null){
            stack1.push(p1);
            p1 = p1.next;
        }
        while(p2!=null){
            stack2.push(p2);
            p2 = p2.next;
        }
        ListNode o1=null;
        ListNode o2 = null;
        do{
            if(!stack1.isEmpty()) o1 = stack1.pop();
            if(!stack2.isEmpty()) o2 = stack2.pop();
        }while(o1.val==o2.val);
        if(o1.val!=pHead1.val) return o1.next;
        else return null;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
