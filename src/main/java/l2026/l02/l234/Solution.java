package l2026.l02.l234;

import l2026.l02.l206.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode half = reverse(slow.next);
        ListNode p1 = head;
        ListNode p2 = half;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        slow.next = half;
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        printNode(n1);
        System.out.println(solution.isPalindrome(n1));

        ListNode n11 = new ListNode(1);
        ListNode n21 = new ListNode(2);
        System.out.println(solution.isPalindrome(n11));
    }

}