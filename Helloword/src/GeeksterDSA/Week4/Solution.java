package GeeksterDSA.Week4;

import java.io.*;
import java.util.*;

public class Solution {
    
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Solution insert(Solution list,int data){
        Node new_node = new Node(data);
        if(head == null){
            list.head = new_node;
        }else{
            Node curr = list.head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = new_node;
        }
        return list;
    }
    
    
    
    public static void printList(Solution list) {
        Node curr = list.head;
        
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        
        System.out.println("\n");
        
    }
    
    public static Node oddEvenList(Node head) {
        if(head == null){
            return null; 
        }
        
        Node odd = head; 
        Node even = head.next; 
        Node evenHead = even; 
        
        while(even != null && even.next != null){
            odd.next = even.next; 
            odd = odd.next; 
            even.next = odd.next; 
            even = even.next; 
        }
        odd.next = evenHead; 
        return head; 
    }

    public static void main(String[] args) {
        Solution list = new Solution();
        Scanner userinput = new Scanner(System.in);
        int number = userinput.nextInt();
        int spilt = userinput.nextInt();
        while(number != 0){
            list = insert(list,userinput.nextInt());
            number--;
        }
        
//       Node[] arr =  splitListToParts(list.head,spilt);
//        oddEvenList(list.head);
//        printList(list);
    }
    
//    public static Node[] splitListToParts(Node head, int k) {
//       static final int size = size(head);
//        Node[] res = new Node[k];
//        if(k > size){
//            Node temp = head;
//            for(int i = 0; i < k; i++){
//                if(temp != null){
//                    Node next = temp.next;
//                    temp.next = null;
//                    res[i] = temp;
//                    temp = next;
//                }
//                
//            }
//        }else{
//            int rem = size % k;
//            int quo = size / k;
//            Node temp = head;
//            for(int i = 0; i < k; i++){
//                
//                Node chead = temp;
//                
//                int noOfMove = i <= (rem - 1) ? quo  : quo - 1;
//                
//                while(noOfMove > 0 && temp != null){
//                    temp = temp.next;
//                    noOfMove--;
//                }
//                
//                Node next = temp.next;
//                temp.next = null;
//                res[i] = chead;
//                temp = next;
//            }
//        }
//        return res;
//    }
//    
//    public int size(Node head){
//        int size = 0;
//        while(head != null){
//            size++;
//            head = head.next;
//        }
//        return size;
//    }

}



