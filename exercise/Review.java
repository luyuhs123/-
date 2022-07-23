package exercise;

import list.ListNode;
import tree.TreeNode;

import java.util.*;

/**
 * @auther luyu
 */
public class Review {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> temp = new LinkedList<>();

    public static void main(String[] args) {
        Review review = new Review();
        review.backTracking(1,5);
        List<List<Integer>> result = review.result;
        for (List<Integer> queue : result) {
            System.out.println(queue);
        }
    }


//    手撕

//    快排代码
    public void quickSort(int[] nums , int start ,int end){
        if(start<end){
//            选择第一个作为衡量值
            int chosen = nums[start];
            int i = start;
            int j = end;
            while(i<j&&nums[j]>chosen){
                j--;
            }
            if(i<j){
                nums[i] = nums[j];
                i++;
            }
            while(i<j&&nums[i]<chosen){
                nums[i]=nums[i];
            }
            if(i<j){
                nums[j] = nums[i];
                j--;
            }
            nums[i] = chosen;
            quickSort(nums,start,i-1);
            quickSort(nums,i+1,end);
        }
    }

//    二叉树层序遍历代码
    public List<List<Integer>> sequenceTraversal(TreeNode treeNode){
        Queue<TreeNode> queue = new LinkedList();
        TreeNode cur = treeNode;
        List<List<Integer>> result = new ArrayList();
        queue.add(cur);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
//            遍历每一层
            for (int i = 0; i < size; i++) {
                TreeNode remove = queue.remove();
                temp.add(remove.val);
                if(remove.left!=null){
                    queue.add(remove.left);
                }
                if (remove.right!=null){
                    queue.add(remove.right);
                }
            }
            result.add(temp);
        }
        return result;
    }

//    二叉树后序遍历代码
    public List<Integer> preTraversal(TreeNode treeNode){
        List<Integer> result = new ArrayList<>();
        TreeNode cur = treeNode;
//        标记，判断是否已经处理过右子树
        TreeNode flag = null;
        Stack<TreeNode> stack = new Stack();
        while(!stack.isEmpty()||cur!=null){
//            找到最左子树
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
//            判断是否处理过
            if(cur.right!=null&&cur.right!=flag){
                cur = cur.right;
            }
            else {
                stack.pop();
                result.add(cur.val);
                flag = cur;
                cur = null;
            }
        }
        return result;
    }

//    KMP算法 通过模式串先求next数组
    public int[] nextTable(String s){
        if(s==null||s.equals("")){
            return null;
        }
        int[] nextTable = new int[s.length()];
        int j = -1;
        nextTable[0] = j;
        for (int i = 0; i < s.length(); i++) {
            while(j>=0&&s.charAt(j+1)!=s.charAt(i)){
                j = nextTable[j];
            }
            if(s.charAt(j+1)==s.charAt(i)){
                j++;
            }
            nextTable[i] = j;
        }
        return nextTable;
    }

//    翻转链表
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

//    回溯算法，找到1~n的所有组合
    public void backTracking(int start ,int n){
        result.add(temp);
        for (int i = start; i <= n; i++) {
            temp.add(i);
            backTracking(i+1,n);
            temp.remove(temp.size()-1);
        }

    }
}
