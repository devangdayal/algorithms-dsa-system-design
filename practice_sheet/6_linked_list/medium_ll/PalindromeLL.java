package medium_ll;

import java.util.Stack;

public class PalindromeLL {
    public boolean isPalindrome(ListNode head) {

        ListNode dummyHead = head;
        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        while (dummyHead != null) {
            int n = stack.pop();
            if (n != dummyHead.val) {
                return false;
            }
            dummyHead = dummyHead.next;
        }

        return true;
    }

}
