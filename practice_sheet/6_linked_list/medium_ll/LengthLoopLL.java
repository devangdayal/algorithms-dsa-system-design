package medium_ll;

public class LengthLoopLL {
    public int lengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }

    public int countLoopLength(ListNode meetingPoint) {
        ListNode temp = meetingPoint;
        int length = 1;

        while (temp.next != meetingPoint) {
            temp = temp.next;
            length++;
        }
        return length;
    }
}
