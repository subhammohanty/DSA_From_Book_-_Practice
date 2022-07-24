package problem_Tree;

import java.util.LinkedList;
import java.util.Queue;

import problem_Tree.BinaryTree.Node;

public class LengthOfBinaryTree {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(5);
		System.out.println("Binary Tree Example");
		System.out.println("Building tree with root value " + root.value);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		System.out.println("Traversing tree in order");
	    tree.traverseInOrder(root);
	    System.out.println();
	    System.out.println(size(root));
	}

	public static int size(Node root) {
		if(root == null) {return 0;}
		Queue<Node> q  = new LinkedList<BinaryTree.Node>();
		q.add(root);
		int counter = 0;
		while(!q.isEmpty()) {
			Node temp = q.remove();
			counter++;
			if(temp != null) {
				if(temp.left != null) {
					q.add(temp.left);
				}
				if(temp.right != null) {
					q.add(temp.right);
				}
			}
		}
		return counter;
	}
}
