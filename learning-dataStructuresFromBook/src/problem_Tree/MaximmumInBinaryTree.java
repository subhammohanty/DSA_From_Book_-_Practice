package problem_Tree;

import java.util.LinkedList;
import java.util.Queue;

import problem_Tree.BinaryTree.Node;

public class MaximmumInBinaryTree {
	
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
	    int maxInBinaryTree = maxInBinaryUsingRecursion(root);
	    System.out.println("Max Element : " + maxInBinaryTree);
		
	}

	public static int maxInBinaryTree(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int max = Integer.MIN_VALUE;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.remove();
			if (temp != null) {
				if (temp.value > max) {
					max = temp.value;
				}
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
			}
		}
		return max;
	}
	//Using recursion
	public static int maxInBinaryUsingRecursion(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int result = root.value;
		int left = maxInBinaryUsingRecursion(root.left);
		int right = maxInBinaryUsingRecursion(root.right);
		
		if(left > result) {
			result = left;
		}
		if(right > result) {
			result = right;
		}
		return result;
	}
}
