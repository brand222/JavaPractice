package binarySearchTrees;

public class Example1 {

	public static void main(String[] args) {

	}
	/*
	 * Why should you use a search tree? 1) You can search, and insert/delete
	 * items quickly in a tree 2) Ordered Arrays are bad at insertions/deletions
	 * 3)Finding items in a linked List is slow 4)Time needed to perform an
	 * operation on a tree is O(log N) 5) On average, a tree is more efficient
	 * if you need to perform many different types of operations 6)
	 */

	class Node {
		// here we are creating pointers to the left and right node
		Node left, right;
		// the data inside the node
		int data;

		// here we will create a constructor
		public Node(int data) {
			this.data = data;
		}
		// this will take in a node value and look to the left and right to see
		// where we want to insert

		public void insert(int value) {
			// if the value is less than or equal to the data
			// of the cell, then we want to insert it on the left side
			if (value <= data) {
				// if there is no node yet, then we create a new node
				if (left == null) {
					// here we pass in a value to new node
					left = new Node(value);
				} else {
					// otherwise, i ask my left to insert it and push down
					// recursion stack
					left.insert(value);
				}
			} else {
				if (right == null) {
					right = new Node(value);
				} else {
					right.insert(value);
				}
			}
		}

		public boolean contains(int value) {
			if (value == data) {
				return true;
			} else if (value < data) {
				if (left == null) {
					return false;
				} else {
					return left.contains(value);
				}
			} else {
				if (right == null) {
					return false;
				} else {
					return right.contains(value);
				}
			}
		}
		//here is an example of an "In-order Traversal"
		public void printInOrder() {
			if (left != null) {
				left.printInOrder();
			}
			System.out.println(data);
			if(right != null) {
				right.printInOrder();
			}
		}
	}

}