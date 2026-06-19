package medium_ll;

public class RemoveNthNodeLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i=0;i<=n;i++){
            fast = fast.next;
        }

        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}
