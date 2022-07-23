package 剑指offer;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @auther luyu
 */
public class 二叉搜索树的第k大节点 {
    List<Integer> list = new LinkedList<>();
    public int kthLargest(TreeNode root, int k) {
        dfs(root);
        return list.get(list.size()-k);
    }
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
