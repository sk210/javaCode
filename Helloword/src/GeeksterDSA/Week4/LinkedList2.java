package GeeksterDSA.Week4;

public class LinkedList2 {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static LinkedList2 insert(LinkedList2 list,int data) {
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
	
	public static void print(LinkedList2 list) {
		Node curr = list .head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	public static void main(String[] args) {
		
		LinkedList2 list = new LinkedList2();
		
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		list = insert(list,7);
		list = insert(list,8);
		list = insert(list,9);
		
		print(list);
		
	}

}
