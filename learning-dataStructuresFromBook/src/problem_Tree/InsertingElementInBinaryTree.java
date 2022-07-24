package problem_Tree;

import java.util.LinkedList;
import java.util.Queue;

import problem_Tree.BinaryTree.Node;

public class InsertingElementInBinaryTree {
	
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
	    insertElement(root, 10);
	    System.out.println();
	    insertElement(root, 12);
	    tree.traverseInOrder(root);
	}
	//Can Refer Binary Class in this Package
	public static Node insertElement(Node root, int data) {
		if (root == null) {
			return null;
		}
		Queue<Node> q = new LinkedList<BinaryTree.Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.remove();
			if (temp != null) {
				if (temp.left != null) {
					q.add(temp.left);
				} else {
					temp.left = new Node(data);
					return root;
				}
				if (temp.right != null) {
					q.add(temp.right);
				} else {
					temp.right = new Node(data);
					return root;
				}
			}
		}
		return root;

	}

}
