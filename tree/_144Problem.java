package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther luyu
 * 二叉树的前中后序递归遍历
 */
public class _144Problem {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        preorderTraverse(root,list);
        return list;
    }
//    前序遍历
    public void preorderTraverse(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        preorderTraverse(root.left,list);
        preorderTraverse(root.right,list);
    }
//    中序遍历后序遍历其实一样只要改变操作和遍历的顺序即可
}
