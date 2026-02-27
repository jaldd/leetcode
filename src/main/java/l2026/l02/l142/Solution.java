package l2026.l02.l142;

import l2026.l02.l206.ListNode;

public class Solution {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                return slow;
            }
        }

        return slow;
    }
}