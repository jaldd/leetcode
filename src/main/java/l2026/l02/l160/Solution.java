package l2026.l02.l160;

import l2026.l02.l206.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {

            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    public static void main(String[] args) {
        Solution solution1 = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode n11 = new ListNode(11);
        ListNode n21 = new ListNode(21);
        ListNode n31 = new ListNode(31);
        ListNode n41 = new ListNode(41);
        n11.next = n21;
        n21.next = n31;
        n31.next = n41;
        n41.next = n5;
//        printNode(n1);
        System.out.println(solution1.getIntersectionNode(n1, n11));

    }

    private static void printNode(ListNode reversed) {
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }
}