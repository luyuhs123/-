package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @auther luyu
 * 二叉树的层序遍历，使用到的是队列
 */
public class _102Problem {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue queue = new LinkedList();
        queue.add(root);
        List<List<Integer>> resultList = new ArrayList<>();
        if(root==null){
            return null;
        }
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List tempList = new ArrayList();
            for (int i = 0; i < queueSize; i++) {
                TreeNode remove = (TreeNode) queue.remove();
                tempList.add(remove.val);
                if(remove.left!=null){
                    queue.offer(remove.left);
                }
                if(remove.right!=null) {
                    queue.offer(remove.right);
                }
            }
            resultList.add(tempList);
        }
        return resultList;
    }
}
