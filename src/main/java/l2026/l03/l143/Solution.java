package l2026.l03.l143;

import l2026.l02.l206.ListNode;

public class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode half = slow.next;

        slow.next = null;
        half = reverse(half);

        ListNode tempHead;
        ListNode tempHalf;
        while (half != null && head != null) {
            tempHead = head.next;
            tempHalf = half.next;
            head.next = half;
            half.next = tempHead;

            head = tempHead;
            half = tempHalf;
        }
    }

    ListNode reverse(ListNode half) {
        ListNode pre = null;
        ListNode current = half;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

}