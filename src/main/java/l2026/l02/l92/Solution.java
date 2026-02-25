package l2026.l02.l92;

import l2026.l02.l206.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode pre = tmp;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode current = pre.next;
        for (int i = left; i < right; i++) {
            ListNode next = current.next;
            current.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }

        return tmp.next;
    }

    public ListNode reverseBetween1(ListNode head, int left, int right) {

        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        ListNode pre = tmp;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode rightNode = pre.next;
        for (int i = left; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        ListNode leftNode = pre.next;
        ListNode rightCurrent = rightNode.next;

        pre.next = null;
        rightNode.next = null;
        reverse1(leftNode);
        pre.next = rightNode;
        leftNode.next = rightCurrent;

        return tmp.next;
    }

    public void reverse1(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode next = head.next;
        head.next = null;
        reverse1(next);
        next.next = head;
    }

    public void reverse(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        printNode(n1);
        printNode(solution.reverseBetween1(n1, 2, 4));

    }

    private static void printNode(ListNode reversed) {
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }
}