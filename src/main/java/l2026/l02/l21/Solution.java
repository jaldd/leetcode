package l2026.l02.l21;

import l2026.l02.l206.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode dummary = new ListNode(-1);
        ListNode current = dummary;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        if (p1 != null) {
            current.next = p1;
        }
        if (p2 != null) {

            current.next = p2;
        }
        return dummary.next;
    }
}