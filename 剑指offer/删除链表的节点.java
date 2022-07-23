package 剑指offer;

import list.ListNode;

/**
 * @auther luyu
 */
public class 删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur!=null){
            if(cur.val==val&&cur==head){
                return head.next;
            }
            else if(cur.val==val&&cur!=head){
                pre.next = cur.next;
                return head;
            }
            pre = cur;
            cur=cur.next;
        }
        return head;
    }
}
