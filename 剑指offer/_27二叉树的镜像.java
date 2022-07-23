package 剑指offer;

import tree.TreeNode;

/**
 * @auther luyu
 * 我使用的是根左右的递归方式，需要新建节点
 * 也可以使用左右跟的后序遍历，在原root上进行更改即可
 */
public class _27二叉树的镜像 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        TreeNode treeNode1 = mirrorTree(treeNode);
        System.out.println(treeNode1);
    }
    public static TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return new TreeNode();
        }
        TreeNode newRoot = new TreeNode(root.val);
        dp(root,newRoot);
        return newRoot;
    }
    public static void dp(TreeNode root,TreeNode newRoot){
        if(root==null){
            return;
        }
        TreeNode leftNode = null;
        TreeNode rightNode = null;
        if(root.right!=null){
            leftNode = new TreeNode(root.right.val);
        }
        if(root.left!=null){
            rightNode = new TreeNode(root.left.val);
        }
        newRoot.left=leftNode;
        newRoot.right=rightNode;
        dp(root.right,leftNode);
        dp(root.left,rightNode);
    }
}
