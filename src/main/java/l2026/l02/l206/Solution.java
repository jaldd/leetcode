package l2026.l02.l206;

public class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = null;

        ListNode res = reverseList(next);
        next.next = head;
        return res;

    }

    public ListNode reverseList1(ListNode head) {
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
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printNode(n1);
        ListNode reversed = solution.reverseList1(n1);
        printNode(reversed);

    }

    private static void printNode(ListNode reversed) {
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }
}