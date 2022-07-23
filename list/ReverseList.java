package list;

/**
 * @auther luyu
 * 力扣206翻转链表
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(7,null);
        ListNode listNode1 = new ListNode(6,listNode);
        ListNode listNode2 = new ListNode(5,listNode1);
        ListNode listNode3 = new ListNode(4,listNode2);
        ListNode listNode4 = new ListNode(3,listNode3);
        ListNode listNode5 = new ListNode(2,listNode4);
        ListNode listNode6 = new ListNode(1,listNode5);
        ListNode head = reverseList(listNode6);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur!=null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
