package GeeksterDSA.Week4;
import java.util.Scanner;

public class LinkedList1 {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static LinkedList1 insert(LinkedList1 list,int data) {
		
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
	
	public static void printList(LinkedList1 list) {
		Node curr = list.head;
		
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
		System.out.println("\n");
		
	}
	
	public static LinkedList1 deleteByKey(LinkedList1 list,int key) {
		Node curr = list.head;
		Node prev = null;
		
		if(curr != null && curr.data == key) {
			list.head = curr.next;
			return list;
		}
		
		while(curr != null && curr.data != key) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr != null) {
			prev.next = curr.next;
			return list;
		}
		
		if(curr == null) {
			System.out.println(key + " not found");
		}
		return list;
	}
	
	public static LinkedList1 deleteByIndex(LinkedList1 list,int index){
		Node curr = list.head;
		Node prev = null;
		
		if(index == 0 && curr != null) {
			list.head = curr.next;
			return list;
		}
		
		int counter = 0;
		while(curr != null) {
			if(counter == index) {
				prev.next = curr.next;
				break;
			}
			else {
				prev = curr;
				curr = curr.next;
				counter++;
			}
			
		}
		
		if(curr == null) {
			System.out.println("index not found");
		}
		return list;
		
	}
	
	public static LinkedList1 printAfterIndex(LinkedList1 list,int index) {
		Node curr = list.head;
		Node prev = null;
		if(index == 0 && curr != null) {
			list.head = curr.next;
			return list;
		}
		
		int count = 0;
		while(curr != null) {
			if(index == count) {
				list.head = curr.next;
				break;
			}else {
				curr = curr.next;
				count++;
			}
		}
		
		if(curr == null) {
			System.out.println("index not found");
		}
		return list;
	}
	
	public static int findIndex(LinkedList1 list,int element) {
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
			System.out.println("given elemnt is not found");
		}
		
		return counter;
	}

	public static void main(String[] args) {
		
		Scanner userinput = new Scanner(System.in);
		LinkedList1 list = new LinkedList1();
		
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		list = insert(list,userinput.nextInt());
		
		printList(list);
		
		deleteByKey(list,3);
		
		printList(list);
		
		deleteByIndex(list,2);
		
		printList(list);
		
		printAfterIndex(list,0);
		
		printList(list);
		
		System.out.println(findIndex(list,7));

	}
	
}
