package hot100;

import list.ListNode;

/**
 * @auther luyu
 */
public class 两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //保存进位
        int scale=0;
        ListNode head = new ListNode();
        ListNode cur = head;
        while(l1!=null||l2!=null){
            int value1 = 0;
            int value2 = 0;
            if(l1!=null){
                value1=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                value2=l2.val;
                l2=l2.next;
            }
            int sum = value1+value2+scale;
            if(sum>=10){
                sum-=10;
                scale=1;
            }
            else {scale=0;}
            ListNode node = new ListNode(sum,null);
            cur.next=node;
            cur=cur.next;
        }
        if(scale==1){
            ListNode node = new ListNode(1,null);
            cur.next=node;
        }
        return head.next;
    }
}
