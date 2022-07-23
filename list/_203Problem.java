package list;

/**
 * @auther luyu
 */
//删除链表中的指定元素的节点。可以使用虚拟头结点的方式，也可使直接在原链表中修改（直接将头节点往后移动一格即可）
public class _203Problem {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(7,null);
        ListNode listNode1 = new ListNode(7,listNode);
        ListNode listNode2 = new ListNode(7,listNode1);
        ListNode listNode3 = new ListNode(7,listNode2);
        ListNode listNode4 = new ListNode(7,listNode3);
        ListNode listNode5 = new ListNode(7,listNode4);
        ListNode listNode6 = new ListNode(7,listNode5);
        int val = 7;
        ListNode headList = removeElements(listNode6, val);
        while(headList!=null){
            System.out.println(headList.val);
            headList=headList.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode virtualNode  = new ListNode(-1,head);
        ListNode realHead = virtualNode;
        while(realHead!=null){
            ListNode nextNode = realHead.next;
            if(nextNode!=null) {
                while (nextNode!=null&&nextNode.val == val) {
                    realHead.next = nextNode.next;
                    nextNode = realHead.next;
                }
            }
                realHead = realHead.next;
        }
        return virtualNode.next;
    }

    public static ListNode removeElements2(ListNode head, int val){
        ListNode virtualNode  = new ListNode(-1,head);
        ListNode realHead = virtualNode;
        while(realHead.next!=null){
            if(realHead.next.val==val){
                ListNode nextNode = realHead.next;
                realHead.next = realHead.next.next;
                nextNode=null;
            }
            else {
                realHead=realHead.next;
            }
        }
        return virtualNode.next;
    }
}
