package l2025.l09.l03;

public class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    ListNode addTwoNumbers(ListNode l1, ListNode l2, int jinwei) {

        if (l1 == null && l2 == null && jinwei == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        int sum = val1 + val2 + jinwei;
        int newjinwei = sum / 10;
        int dangqian = sum % 10;

        ListNode res = new ListNode(dangqian);

        res.next = addTwoNumbers((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, newjinwei);

        return res;
    }
}