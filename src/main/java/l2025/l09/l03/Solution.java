package l2025.l09.l03;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //创建虚拟节点简化操作
        ListNode xuni = new ListNode(0);
        ListNode current = xuni;
        //进位
        int jinwei = 0;

        //当还有节点需要处理或者有进位时循环
        while (l1 != null || l2 != null || jinwei != 0) {

            //获取当前位的值
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + jinwei;
            //计算进位
            jinwei = sum / 10;
            //计算当前位的数字
            int dangqian = sum % 10;

            //创建新节点
            current.next = new ListNode(dangqian);
            current = current.next;

            //移动到下个节点
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        //返回结果链表（跳过虚拟节点)
        return xuni.next;
    }
}