package GeeksterDSA.Week4;

class Node{
	int key;
	Node left;
	Node right;
	
	Node(int key){
		this.key = key;
		left = null;
		right = null;
	}
}

public class BinaryTree {
	
	public static void preorder(Node root) {
		if(root == null) return;
		System.out.print(root.key + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root == null)return;
		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);
	}
	
	public static void postorder(Node root) {
		if(root == null)return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key + " ");
	}
	
	public static int countOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		else {
			return 1 + countOfNodes(root.left) + countOfNodes(root.right); 
		}
		
	}
	
	public static int getHeight(Node root) {
		if(root == null) {
			return -1;
		}
		else {
			int left = getHeight(root.left);
			int right = getHeight(root.right);
			
			if(left > right) {
				return (left + 1);
			}
			else {
				return (right + 1);
			}
		}
	}
	
	public static int leafNode(Node root){
		if(root == null) {
			return 0;
		}
		
		if(root.left == null && root.right == null) {
			return 1;
		}
			
		int left = leafNode(root.left);
		int right = leafNode(root.right);
		return left + right;
	}
	
	static int sum = 0;
	public static int sumOfNodes(Node root) {
		if(root == null) {
			return 0;
		}
		
		sum = sum + root.key;
		
		 sumOfNodes(root.left);
		 sumOfNodes(root.right);
		
		return sum;
		
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		preorder(root);
		
		System.out.println();
		
		inorder(root);
		
		System.out.println();
		
		postorder(root);
		
		System.out.println();
		
		System.out.println(countOfNodes(root));
		
		System.out.println(getHeight(root));
		
		System.out.println(leafNode(root));
		
		System.out.println(sumOfNodes(root));

	}

}
