package tree_relas;

public class TreeNode {
	
	Node[] tree;
	int root,length;
	
	public TreeNode(int len){
		this.root = 0;
		this.length = len;
		this.tree = new Node[len];
	}
	
	public void insert(int value){
		
	}
	public void dispaly(){}
	public void find(){}
	public void delete(){}
	
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(3);
		Node n1 = new Node(1,-1);
		Node n2 = new Node(2, 1);
		Node n3 = new Node(3, 1);
	}

}

class Node{
	int val;
	int parent;
	public Node(int v,int p){
		val = v;
		this.parent = p;
	}
}
