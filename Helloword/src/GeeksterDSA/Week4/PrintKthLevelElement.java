package GeeksterDSA.Week4;

public class PrintKthLevelElement{
	
	static class Node{
		int key;
		Node left;
		Node right;
		Node(int key){
			this.key = key;
			this.left = null;
			this.right = null;

		}
	}
	
	public static void printKthLevel(Node root,int k) {
		if(root == null) return;
		if(k == 0) {
			System.out.print(root.key + " ");
		}
		printKthLevel(root.left,k-1);
		printKthLevel(root.right,k-1);
		
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		printKthLevel(root,1);

	}

}
