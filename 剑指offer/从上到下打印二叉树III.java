package 剑指offer;

import tree.TreeNode;

import java.util.*;

/**
 * @auther luyu
 *
 * 可以使用双端队列来代替我的使用栈和队列一起使用的方式
 * 双端队列是  Deque<Integer> levelList = new LinkedList<Integer>();
 */
public class 从上到下打印二叉树III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Stack<TreeNode> stack = new Stack<>();
        int flag = 0;
        while(!queue.isEmpty()||!stack.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            if(flag==0){
                int size = queue.size();
                for (int i =0 ;i<size;i++){
                    TreeNode remove = queue.remove();
                    temp.add(remove.val);
                    if(remove.left!=null){
                        stack.push(remove.left);
                    }
                    if(remove.right!=null){
                        stack.push(remove.right);
                    }
                }
                flag=1;
                result.add(temp);
            }
            else {
                int size = stack.size();
                Stack<TreeNode> tempStack = new Stack<>();
                for (int i =0 ;i<size;i++){
                    TreeNode remove = stack.pop();
                    temp.add(remove.val);
                    tempStack.add(remove);
                }
                int tempSize = tempStack.size();
                for (int i =0;i<tempSize;i++) {
                    TreeNode treeNode = tempStack.pop();
                    if(treeNode.left!=null){
                        queue.add(treeNode.left);
                    }
                    if(treeNode.right!=null){
                        queue.add(treeNode.right);
                    }
                }
                flag=0;
                result.add(temp);
            }
        }
        return result;
    }

    public void demo(){
        Deque<TreeNode> deque = new LinkedList<>();
//        双端队列能在队列的前后任意增加，也就是说在这题里面，如果遇到要相反的一行，就将他添加到前面就可以了
//        deque.addFirst();
//        deque.addLast();
    }
}
