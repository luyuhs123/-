package 剑指offer;

import tree.TreeNode;

/**
 * @auther luyu
 */
public class 树的子结构 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null&&B!=null)&&(recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }
    boolean recur(TreeNode A, TreeNode B) {
//        B是null说明已经遍历完B树了，还没有返回false则就是他的子树
        if(B==null){
            return true;
        }
//        A若是null说明两个树的结构已经不同了，或者两个树结构相同但是数值不同
        if(A==null||A.val!=B.val){
            return false;
        }
        return recur(A.left,B.left)&&recur(A.right,B.right);
    }
}
