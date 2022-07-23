package 剑指offer;

import java.util.Stack;

/**
 * @auther luyu
 */
public class 二叉搜索树与双向链表 {
    static Node pre,head;
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }

    }

    public static void main(String[] args) {
        Node node = new Node(1,null,null);
        Node node1 = new Node(3,null,null);
        Node node2 = new Node(2,node,node1);
        Node node3 = new Node(5,null,null);
        Node node4 = new Node(4,node2,node3);
        Node node5 = treeToDoublyList(node4);
        while(node5!=null){
            System.out.println(node5.val);
            node5 = node5.right;
        }

    }
    public static Node treeToDoublyList(Node root) {
//        1.迭代版本中序遍历
//        Stack<Node> stack = new Stack<>();
//        Node cur = root;
//        while(root.left!=null){
//            root = root.left;
//        }
//        Node removed = null;
//        while(!stack.isEmpty()||cur!=null){
//            while(cur!=null){
//                stack.push(cur);
//                cur = cur.left;
//            }
//            Node pop = stack.pop();
//            cur = pop.right;
//            if(!stack.isEmpty()||cur!=null){
//                while(cur!=null){
//                    stack.push(cur);
//                    cur = cur.left;
//                }
//                pop.right = stack.peek();
//            }
//            pop.left = removed;
//            removed = pop;
//        }
//        root.left = removed;
//        removed.right = root;
//        return root;

//        2.递归的中序遍历
        if(root == null) {return null;}
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;

    }
    public static void dfs(Node cur){
        if(cur==null){
            return;
        }
        dfs(cur.left);
//        逻辑部分
        if(pre != null) {pre.right = cur;}
        else {head = cur;}
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
