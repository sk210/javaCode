package GeeksterDSA.Week4;

public class MergeTwoSortedList {

	public static void main(String[] args) {

	}
	
//	https://leetcode.com/problems/merge-two-sorted-lists/ 
	
/*	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode A = list1;
        ListNode B = list2;
        
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        
        while(A != null && B != null){
            if(A.val<=B.val){
                curr.next = A;
                A = A.next;
            }
            else if(A.val>B.val){
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
            
        }
        
        if(A != null){
            curr.next = A;
        }
        
        if(B != null){
            curr.next = B;
        }
        
        
        
        return head.next;
    } */

}
