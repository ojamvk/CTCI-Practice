package binarySearchTree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		TreeNode node = new TreeNode("a");
	}

	void inOrderTraversal(TreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.name);
			inOrderTraversal(node.right);
		}
	}
}
