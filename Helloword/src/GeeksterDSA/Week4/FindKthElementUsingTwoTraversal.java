package GeeksterDSA.Week4;

public class FindKthElementUsingTwoTraversal{
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static FindKthElementUsingTwoTraversal insert(FindKthElementUsingTwoTraversal list,int data) {
		Node new_node = new Node(data);
		
		if(head == null) {
			list.head = new_node;
		}
		else {
			Node curr = list.head;
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = new_node;
		}
		
		return list;
	}
	
	public static int kthElement(FindKthElementUsingTwoTraversal list,int element) {
		Node curr = list.head;
		int counter = 0;
		while(curr != null) {
			if(curr.data == element) {
				break;
			}
			else {
				curr = curr.next;
				counter++;
			}
		}
		
		if(curr == null) {
			System.out.print("element not found ");
			return 0;
		}
		
		return counter;
		
	}

	public static void main(String[] args) {
		FindKthElementUsingTwoTraversal list = new FindKthElementUsingTwoTraversal();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		list = insert(list,7);
		list = insert(list,8);
		list = insert(list,9);
		
		System.out.println(kthElement(list,10));

	}

}
