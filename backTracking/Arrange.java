package backTracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @auther luyu
 *力扣77题   排列，使用回溯法
 * 回溯法本质上其实是一种暴力破解法，但是可以通过剪枝进行优化
 * 每一个能有回溯法做的题目，可以把他画出一个多叉树，回溯的广度就是树的宽度
 * 回溯的深度就是树的深度  ，回溯模板可以按照本题来看
 */
public class Arrange {
    List<List<Integer>> result = new ArrayList<>();
    Deque<Integer> temp = new ArrayDeque<>();
    public List<List<Integer>> combine(int n, int k) {
        backTracking(1,n,k);
        return result;
    }

    /**
     *
     * @param startIndex 是指每一个横向的遍历从n开始
     *          deep 是指回溯的深度
     */
    public void backTracking(int startIndex,int n ,int k){
            if(temp.size()==k){
                result.add(new ArrayList<>(temp));
                return;
        }
//            广度遍历
        for (int i = startIndex; i <= n ; i++) {
            temp.add(i);
//            深度遍历
            backTracking(i+1,n,k);
//            回溯
            temp.removeLast();
        }

    }
}
