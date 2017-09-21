package tree_relas;

import java.util.ArrayList;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void BFSSearch(Node1 origin, ArrayList visited, Queue<Node1> q){
		q.offer(origin);
		while(!q.isEmpty() && !visited.contains(origin)){
			Node1 n = q.poll();
			System.out.println(n.data);
			visited.add(n);
			q.offer(n.left); q.offer(n.right);
			BFSSearch(origin.left,visited,q);
			BFSSearch(origin.right,visited,q);
		}
	}
}
