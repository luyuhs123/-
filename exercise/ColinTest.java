package exercise;

import tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @auther luyu
 */
public class ColinTest {
//    将二叉树的每一层一行一行打印出来。
    /**
     * 很简单，初始化队列，队列中放入头节点，层序遍历
     * 遍历队列，将队列中的点拿出来
     * @param treeNode
     */
    public void test1(TreeNode treeNode){
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque();
        TreeNode cur = treeNode;
        queue.add(cur);
        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode pop = queue.pop();
                temp.add(pop.val);
                if(pop.left!=null){
                    queue.add(pop.left);
                }
                if(pop.right!=null){
                    queue.add(pop.right);
                }
            }
            result.add(temp);
        }
    }
}
