package 剑指offer;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @auther luyu
 */
public class 从上到下打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> levelOrderQueue = new LinkedList<>();
        levelOrderQueue.add(root);
        List<Integer> result = new ArrayList<>();
        while(!levelOrderQueue.isEmpty()){
            for (int i=0;i<levelOrderQueue.size();i++){
                TreeNode remove = levelOrderQueue.remove();
                result.add(remove.val);
                levelOrderQueue.add(remove.left);
                levelOrderQueue.add(remove.right);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
