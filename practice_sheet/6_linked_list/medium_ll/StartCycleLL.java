package medium_ll;

public class StartCycleLL {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (head != fast) {
                    fast = fast.next;
                    head = head.next;
                }
                return head;
            }

        }
        return null;
    }
}
