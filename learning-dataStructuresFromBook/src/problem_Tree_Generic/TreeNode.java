package problem_Tree_Generic;

public class TreeNode {
	static class Node {
		int value;
		Node firstChild, nextSibling;

		Node(int value) {
			this.value = value;
			firstChild = null;
			nextSibling = null;
		}
	}

	public void insert(Node node, int value) {
		if (value < node.value) {
			if (node.firstChild != null) {
				insert(node.firstChild, value);
			} else {
				System.out.println(" Inserted " + value + " to left of " + node.value);
				node.firstChild = new Node(value);
			}
		} else if (value > node.value) {
			if (node.nextSibling != null) {
				insert(node.nextSibling, value);
			} else {
				System.out.println("  Inserted " + value + " to right of " + node.value);
				node.nextSibling = new Node(value);
			}
		}
	}

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.firstChild);
			System.out.print(" " + node.value);
			traverseInOrder(node.nextSibling);
		}
	}
	
	public void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print(" " + node.value);
	        traversePreOrder(node.firstChild);
	        traversePreOrder(node.nextSibling);
	    }
	}

	public static void main(String args[]) {
		TreeNode tree = new TreeNode();
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
	    tree.traversePreOrder(root);

	}
}

