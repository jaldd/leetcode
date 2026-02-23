package l2026.l02.l141;

import l2026.l02.l206.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;}
        }
        return false;
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
        n5.next = n1;
//        printNode(n1);
        System.out.println(solution.hasCycle(n1));

    }

    private static void printNode(ListNode reversed) {
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }
}