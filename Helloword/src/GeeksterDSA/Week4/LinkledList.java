package GeeksterDSA.Week4;

public class LinkledList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int value){
			this.data = value;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node n1 = new Node(3);
		Node n2 = new Node(4);
		Node n3 = new Node(6);
		Node n4 = new Node(8);
		Node n5 = new Node(7);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

	}

}
