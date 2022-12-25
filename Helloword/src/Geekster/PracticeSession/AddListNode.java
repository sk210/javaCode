package Geekster.PracticeSession;
import java.util.*;

public class AddListNode {
	
	static Node head;
	static Node head2;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static AddListNode insert(AddListNode list,int data) {
		
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
	
	public static AddListNode insert2(AddListNode list,int data) {
		
		Node new_node = new Node(data);
		
		if(head2 == null) {
			list.head2 = new_node;
		}
		else {
			Node curr = list.head2;
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = new_node;
		}
		
		return list;
		
	}
	
	public static AddListNode addTwoNumbers(AddListNode l1, AddListNode l2) {
        Node curr1 = l1.head ;
        Node curr2 = l2.head2;
        AddListNode list = new AddListNode();
        int charry = 0;
        while(curr1.next != null && curr2.next != null){
            int sum = curr1.data + curr2.data;
            int temp = sum%10 + charry;
            list = insert(list,temp);
            charry = sum/10;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while(curr1.next != null){
            int sum = curr1.data;
            int temp = sum%10 + charry;
            list = insert(list,temp);
            charry = sum/10;
            curr1 = curr1.next;
        }
         while(curr2.next != null){
            int sum = curr2.data;
            int temp = sum%10 + charry;
            list = insert(list,temp);
            charry = sum/10;
            curr2 = curr2.next;
        }
        return list;
    }
	public static void printList(AddListNode list) {
		Node curr = list.head;
		
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		
		System.out.println("\n");
		
	}

	public static void main(String[] args) {
		AddListNode l1 = new AddListNode();
		AddListNode l2 = new AddListNode();
		
		l1 = insert(l1,2);
		l1 = insert(l1,4);
		l1 = insert(l1,3);
		
		l2 = insert2(l2,5);
		l2 = insert2(l2,6);
		l2 = insert2(l2,4);
		AddListNode list = addTwoNumbers(l1,l2);
		printList(list);
		
		
		
		
		
	}

}
