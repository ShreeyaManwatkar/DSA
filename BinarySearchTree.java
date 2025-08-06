package DSAJava;

class Node{
	int data;
	Node left, right;
	
	Node(int value){
		data = value;
		left=right=null;
	}
}

public class BinarySearchTree {
	Node root;
	
	void insert(int value) {
		root = insertRec(root,value);
	}
	
	Node insertRec(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		
		if (value < root.data) {
			root.left = insertRec(root.left, value);
		}else if (value>root.data){
			root.left = insertRec(root.right, value);
		}
		
		return root;
	}
	
	// Inorder Transversal (prints values)
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.data + " ");
			inorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.insert(2);
		bst.insert(7);
		
		System.out.println("Inorder Transversal of BST");
		bst.inorder(bst.root);    //Print all Values
	}

}
