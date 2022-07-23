package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther luyu
 * 组合问题（三） 数字可以重复使用，求所有等于target的组合
 */
public class _39Problem {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new LinkedList<>();

    public static void main(String[] args) {
        _39Problem problem = new _39Problem();
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = problem.combinationSum(candidates, target);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0);
        return result;
    }

    public void backTracking(int[] candidates,int target,int sum,int startIndex){
        if(sum>=target){
            if(sum==target){
                result.add(new LinkedList<>(temp));
            }
            return;
        }
        for(int i = startIndex;i < candidates.length;i++){
            if(sum>target){
                break;
            }
            temp.add(candidates[i]);
            sum+=candidates[i];
            backTracking(candidates,target,sum,i);
            Integer remove = temp.remove(temp.size() - 1);
            sum -=remove;
        }
    }
}
