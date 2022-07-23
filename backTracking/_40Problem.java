package backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther luyu
 * 和39一样都是求组合的问题，但是不同的是首先他给的数组中是有可能有重复的值比如 1,2,2,3,3,5
 * 从树状结构来看，横向是有冲突的，但是纵向是允许重复的
 * 因此采用一个 used[]数组来标记当是否已经使用过
 */
public class _40Problem {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> temp = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used = new boolean[candidates.length];
        Arrays.fill(used,false);
        backTracking(candidates,target,0,used,0);
        return result;
    }

    public void backTracking(int[] candidates,int target,int startIndex,boolean[] used,int sum){
        if(sum>=target){
            if(sum==target){
                result.add(new LinkedList<>(temp));
            }
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            if(i>0&&candidates[i]==candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            used[i]=true;
            sum+=candidates[i];
            if(sum>target){
                break;
            }
            backTracking(candidates,target,i+1,used,sum);
            Integer remove = temp.remove(temp.size() - 1);
            used[i]=false;
            sum-=remove;

        }
    }
}
