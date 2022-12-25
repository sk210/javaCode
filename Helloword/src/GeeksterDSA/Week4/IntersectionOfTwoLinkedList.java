package GeeksterDSA.Week4;

public class IntersectionOfTwoLinkedList {

	public static void main(String[] args) {
	
	}

}

//https://leetcode.com/problems/intersection-of-two-linked-lists/

/*public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode curr = headA, prev = null;
    // Find the tail of list A
    while(curr != null) {
        prev = curr;
        curr = curr.next;
    }
    prev.next = headA;
    
    ListNode slow = headB, fast = headB;
    
    while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow) {
            curr = headB;
            while(curr != slow) {
                slow = slow.next;
                curr = curr.next;
            }
            
            prev.next = null;
            return slow;
        }
    }

    prev.next = null;
    return null;
}*/