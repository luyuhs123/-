package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @auther luyu
 * 也是前序遍历一个二叉树，但是不同的是不使用递归的方式，使用栈
 */
public class _144Problem2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        stackPreorderTraverse(root,list);
        return list;
    }
    public void stackPreorderTraverse(TreeNode root ,List list){
        Stack stack = new Stack();
        stack.push(root);
        while(!stack.empty()){
            TreeNode pop = (TreeNode) stack.pop();
            if(pop!=null){
                list.add(pop.val);
                if(pop.right!=null) {
                    stack.push(pop.right);
                }{
                    stack.push(pop.left);
                }
            }
        }
     }

     public void stackMiddleTraverse(TreeNode root ,List list){
        TreeNode cur = root;
        Stack stack = new Stack();
            while (cur != null||!stack.empty()) {
//                找到最底层的左子树
                if(cur!=null){
                    stack.push(cur);
                    cur = cur.left;
                }
                else {
//                    如果已经没有左子树了，则将他出栈，然后cur=stack.peek();
                    TreeNode peek = (TreeNode) stack.peek();
                    stack.pop();
                    list.add(peek.val);
                    cur = cur.right;

                }

            }


     }

     public void stackAfterTraverse(TreeNode root ,List list){
        TreeNode cur = root;
//        用来记录右边的是否访问过
        TreeNode flag = null;
        Stack stack = new Stack();
        while(cur!=null||!stack.empty()){
            if(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            else {
                cur = (TreeNode) stack.peek();
                if(cur.right!=flag&&cur.right!=null){
                    cur = cur.right;
                }
                else {
                    stack.pop();
                    list.add(cur.val);
                    flag = cur;
                    cur = null;
                }
            }
        }
     }


}
