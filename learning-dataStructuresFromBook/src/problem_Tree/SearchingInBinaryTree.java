package problem_Tree;

import java.util.LinkedList;
import java.util.Queue;

import problem_Tree.BinaryTree.Node;

public class SearchingInBinaryTree {
	
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
	    boolean present = isPresentRecurssion(root , 4);
	    System.out.println("Is Present : " + present);
	}
	
	public static boolean isPresent(Node root , int data) {
		if(root == null) {
			return false;
		}
		Queue<Node> q = new LinkedList<BinaryTree.Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.remove();
			if (temp != null) {
				if (temp.value == data) {
					return true;
				}

				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
			}
		}
		return false;
	}
	
	//Using Recursion
	public static boolean isPresentRecurssion(Node root , int data) {
		if(root == null) {
			return false;
		}
		if(root.value == data) {
			return true;
		}
		boolean isPresenLeft = isPresentRecurssion(root.left, data);
		boolean isPresentRight = isPresentRecurssion(root.right, data);
		return isPresenLeft || isPresentRight;
	} 
}
