package list;

/**
 * @auther luyu
 * 判断链表有环，并找到环的位置
 * 力扣142
 */
public class ChainList {
    public static ListNode detectCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        int index = 0;
        while(fastNode!=null&&fastNode.next!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next.next;

            if(slowNode==fastNode){
                ListNode start = head;
                ListNode startNode = slowNode;
                while(start!=startNode){
                    start = start.next;
                    startNode = startNode.next;
                }
                return startNode;
            }
        }
        return  null;
    }
}
