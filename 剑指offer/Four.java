package 剑指offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @auther luyu
 */
public class Four {

// Definition for a Node.
    class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
    }

    class Solution {
        public Node copyRandomList(Node head) {
            HashMap<Node,Node> copy = new HashMap<>();
            Node cur = head;
//            第一遍遍历，将新旧链表的对应关系构造好
            while(cur!=null){
                copy.put(cur,new Node(cur.val));
                cur = cur.next;
            }
//          通过保存的映射关系就能构造出来
            cur = head;
            while (cur!=null){
                Node node = copy.get(cur);
                Node random = cur.random;
                node.next=copy.get(cur.next);
                node.random = copy.get(random);
                cur = cur.next;
            }
            return copy.get(head);
        }
    }
}
