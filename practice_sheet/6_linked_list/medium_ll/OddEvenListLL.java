package medium_ll;

public class OddEvenListLL {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode evenHeadStart = evenHead;

        while (evenHead != null && evenHead.next != null) {
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;
            evenHead.next = oddHead.next;
            evenHead = evenHead.next;

        }

        oddHead.next = evenHeadStart;

        return head;

    }
}
