package tree_relas;

import java.util.Stack;

//build the binary Tree
//二叉树
public class Node1 {
	public int data;
	public Node1 left;
	public Node1 right;
	public Node1(int val){
		this.data = val;
	}
	public void displayNode(){
		System.out.println(this.toString());
	}
	
	public static void main(String[] args){
		Node1 n1 = Tree.buildTree();
		Tree t = new Tree();
		t.root = n1;
		t.dispaly_mid(t);
	}
	
	@Override
	public String toString() {
		return data + ""+left.data+""+right.right;
	}
}
class Tree{
	public Node1 root;
	
	public void insert(int value){
		Node1 node = new Node1(value);
		
	}
	//前序遍历非递归实现
	public void dispaly_pre(Tree origin){
		Node1 n = origin.root.left;
		Stack<Node1> stack = new Stack<>();
		if(root==null) return;
		System.out.println(root.data);
		stack.push(root);
		while(!stack.empty() || n!=null){
			while(n!=null){
				stack.push(n);
				System.out.println(n.data);
				n = n.left;
			}
			if(!stack.empty()){
				Node1 node1 = stack.pop();
//				System.out.println(node1.right.data);
				n = node1.right;
			}
		}
	}
	public void dispaly_mid(Tree origin){
		Node1 n = origin.root.left;
		Stack<Node1> stack = new Stack<>();
		if(origin.root==null) return;
//		System.out.println(root.data);
		stack.push(root);
		while(!stack.empty() || n!=null){
			while(n!=null){
				stack.push(n);
//				System.out.println(n.data);
				n = n.left;
			}
			if(!stack.empty()){
				Node1 node1 = stack.pop();
				System.out.println(node1.data);
				n = node1.right;
			}
		}
	}
	/*public void dispaly_post(Tree origin){
		Node1 n = origin.root.left;
		Stack<post_Node> stack = new Stack<>();
		if(origin.root==null) return;
//		System.out.println(root.data);
		stack.push(new post_Node(root));
		while(!stack.empty() || n!=null){
			while(n!=null){
				stack.push(new post_Node(n));
				System.out.println(n.data);
				n = n.left;
			}
			while(!stack.empty() && stack.get(stack.size()-2).visited == true && n!=null){
				//right sub-tree
				stack.peek().visited = true;
				post_Node nodel = stack.peek();
				System.out.println(nodel.node1.data);
				n = nodel.node1;
			}
			if(!stack.empty() && stack.peek().visited == true){
				System.out.println(stack.pop().node1.data);
			}
			
		}
	}*/
	public void search(int value){
		
	}
	public void find(){
		
	}
	public void delete(){
		
	}
	public static Node1 buildTree(){
		Node1 n1 = new Node1(5);
		Node1 n2 = new Node1(3);
		Node1 n3 = new Node1(8);
		Node1 n4 = new Node1(1);
		Node1 n5 = new Node1(4);
		Node1 n6 = new Node1(6);
		n1.left = n2; n1.right = n3;
		n2.left = n4; n2.right = n5;
		n3.left = n6;
//		n3.right = n6;
		return n1;
	}
	

}
class post_Node{
	Node1 node1;
	boolean visited = false;
	public post_Node(Node1 node){
		this.node1 = node;
	}
	public post_Node(Node1 node,boolean b){
		this.node1 = node;
		visited = b;
	}
}
