package l2026.l02.l206;

import lombok.Data;

// 链表节点类（题目会给出，不用自己写）
@Data
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}