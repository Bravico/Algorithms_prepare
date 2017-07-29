package basic;

public class LinkedNode {
	public int val;
	public LinkedNode next;
	
	//初始化
	public static LinkedNode initNode(int v){
		LinkedNode n = new LinkedNode();
		n.val = v;
		return  n;
	}
	public void display(LinkedNode node){
		LinkedNode n = node;
		while(n!=null){
			System.out.println(n.val);
			n = n.next;
		}
	}
	public static LinkedNode findNode(LinkedNode node,int value){
		LinkedNode n = node;
		while(n!=null){
			if(n.val == value) return n;
			n = n.next;
		}
		return null;
	}
	public LinkedNode insertNode(LinkedNode root, int value){
		LinkedNode pre = new LinkedNode(),n = root;
		LinkedNode helper = pre;
		pre.next = root;
		while(n!=null){
			if(n.val >=value){
				//find pre-node
				LinkedNode newNode = new LinkedNode();
				newNode.val = value;
				newNode.next = n;
				helper.next = newNode;
				break;
			}
			helper = helper.next;
			n = n.next;
		}
		return pre.next; //in case delete the first element
	}
	public LinkedNode deleteNode(LinkedNode root, int value){
		LinkedNode node = root;
		LinkedNode pre = null;
		if(root==null) return null;
		while(node!=null){
			if(value == node.val){
				if(node.equals(root)){
					//delete root
					root = root.next;
				}else{
					pre.next = node.next;
					pre = node;
					node = node.next;
				}
			}
		}
		return root;
	}
	
	public static void main(String[] args){
		LinkedNode ln = new LinkedNode();
		LinkedNode n1 = LinkedNode.initNode(2);
		LinkedNode n2 = LinkedNode.initNode(3);
		n1.next = n2;
		LinkedNode n3 = LinkedNode.initNode(5);
		LinkedNode n4 = LinkedNode.initNode(7);
		n2.next = n3;
		n3.next = n4;
		ln.display(n1);
		System.out.println(ln.findNode(n1, 5).val);
		ln.insertNode(n1, 4);
		LinkedNode nn = n1;
		while(nn!=null) {
			System.out.println(nn.val);
			nn = nn.next;
		}
	}
}
