package 剑指offer;

import list.ListNode;

/**
 * @auther luyu
 */
public class 合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode  fake = new ListNode(0),cur=fake;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1!=null?l1:l2;
        return fake.next;
    }
}
