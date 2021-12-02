package list.cycle.easy.q141;

import list.ListNode;

public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null && slow.val != fast.val) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}