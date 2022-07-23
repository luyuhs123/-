package 剑指offer;

import tree.TreeNode;

/**
 * @auther luyu
 */
public class _28对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode newRoot = new TreeNode(root.val);
        dp(root,newRoot);
        return isSy(root,newRoot);
    }
    public Boolean isSy(TreeNode root,TreeNode newRoot){
        if(root==null&&newRoot==null){
            return true;
        }
        if((root!=null&&newRoot!=null)&&(root.val!=newRoot.val)){
            return false;
        }
        if(root==null&&newRoot!=null){
            return false;
        }
        if(root!=null&&newRoot==null){
            return false;
        }
        return isSy(root.left,newRoot.left)&&isSy(root.right,newRoot.right);
    }
    public  void dp(TreeNode root,TreeNode newRoot){
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
