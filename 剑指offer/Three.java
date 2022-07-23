package 剑指offer;

import list.ListNode;

import java.util.ArrayList;

/**
 * @auther luyu
 */
public class Three {
    public static int[] reversePrint(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode theNext = cur.next;
            cur.next=pre;
            pre = cur;
            cur = theNext;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(pre!=null){
            arrayList.add(pre.val);
        }
        return arrayList.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2,null);
        ListNode listNode1 = new ListNode(3,listNode);
        ListNode listNode2 = new ListNode(1,listNode1);
        int[] ints = reversePrint(listNode2);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
