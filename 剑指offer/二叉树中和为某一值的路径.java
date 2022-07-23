package 剑指offer;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther luyu
 */
public class 二叉树中和为某一值的路径 {
    public static List<Integer> temp = new LinkedList<>();
    public static List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        temp.clear();
        result.clear();
        backTracking(root,target);
        return result;
    }
    public void backTracking(TreeNode root,int target){
        if(root==null){return;}
        temp.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            result.add(new LinkedList<>(temp));
        }
        backTracking(root.left,target);
        backTracking(root.right,target);
        temp.remove(temp.size()-1);
    }
}
