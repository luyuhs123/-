package backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther luyu
 */
public class _216Problems {
    static List<Integer> path = new ArrayList<>();
    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        _216Problems problems = new _216Problems();
        List<List<Integer>> lists = problems.combinationSum3(3, 7);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(k,n,1);
        return result;
    }

    public void backTracking(int k, int n,int startIndex){
        if(path.size()==k){
            if(getSum()==n){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            if(path.isEmpty()&&i<=n){
                path.add(i);
                backTracking(k,n,i+1);
                path.remove(path.size()-1);
            }
            else if(getSum()+i<=n){
                path.add(i);
                backTracking(k,n,i+1);
                path.remove(path.size()-1);
            }
            else break;
        }
    }
    public int  getSum(){
        int sum = 0;
        for (Integer integer : path) {
            sum+=integer;
        }
        return sum;
    }
}
