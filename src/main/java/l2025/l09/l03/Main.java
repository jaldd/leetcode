package l2025.l09.l03;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 测试用例1: [2,4,3] + [5,6,4] = [7,0,8]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result1 = solution.addTwoNumbers(l1, l2);
        printList(result1); // 输出: 7 -> 0 -> 8
        
        // 测试用例2: [0] + [0] = [0]
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode result2 = solution.addTwoNumbers(l3, l4);
        printList(result2); // 输出: 0
        
        // 测试用例3: [9,9,9,9,9,9,9] + [9,9,9,9] = [8,9,9,9,0,0,0,1]
        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result3 = solution.addTwoNumbers(l5, l6);
        printList(result3); // 输出: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1



        Solution1 solution1 = new Solution1();

        // 测试用例1: [2,4,3] + [5,6,4] = [7,0,8]
        ListNode l11 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l21 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result11 = solution.addTwoNumbers(l11, l21);
        printList(result1); // 输出: 7 -> 0 -> 8

        // 测试用例2: [0] + [0] = [0]
        ListNode l31 = new ListNode(0);
        ListNode l41 = new ListNode(0);
        ListNode result21 = solution.addTwoNumbers(l31, l41);
        printList(result21); // 输出: 0

        // 测试用例3: [9,9,9,9,9,9,9] + [9,9,9,9] = [8,9,9,9,0,0,0,1]
        ListNode l51 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l61 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result31 = solution.addTwoNumbers(l51, l61);
        printList(result31); // 输出: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1

    }
    
    // 辅助方法：打印链表
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}