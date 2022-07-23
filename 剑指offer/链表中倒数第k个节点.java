package 剑指offer;

import list.ListNode;

/**
 * @auther luyu
 */
public class 链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 1; i < k; i++) {
            head = head.next;
        }
        while(head!=null){
            cur=cur.next;
            head=head.next;
        }
        return cur;
    }
}
