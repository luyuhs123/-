package 剑指offer;

import list.ListNode;

import java.util.HashSet;

/**
 * @auther luyu
 */
public class 两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        HashSet<ListNode> hashSet = new HashSet<>();
//        ListNode temp = headA;
//        while (temp!=null){
//            hashSet.add(temp);
//            temp = temp.next;
//        }
//        temp = headB;
//        while(temp!=null){
//            if(hashSet.contains(temp)){
//                return temp;
//            }
//            temp = temp.next;
//        }
//        return null;
//        方法二：双指针法又叫浪漫的相遇，真的很棒 假设A链表未相遇部分的长度为L1，B链表为L2 而共同部分为C
//        让A和B都走到末尾那么此时A走了L1+C B走了L2+C  走到末尾后，让A从B的头开始走，让B从A的头开始走
//        那么当他们相遇时就为第一个交点  因为都走了L1+L2+C
        if(headA==null||headB==null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;
    }
}
