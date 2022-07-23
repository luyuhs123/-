package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther luyu
 * 分割回文字符串  组合和分割问题可以首先想到回溯。
 * 分割和组合其实差不多，也可以抽象为一个树形
 */
public class _131Problem {
    static List<String> temp = new LinkedList<>();
    static List<List<String>> result = new ArrayList<>();

    public static void main(String[] args) {
        String s ="aab";
        _131Problem problem = new _131Problem();
        List<List<String>> partition = problem.partition(s);
        for (List<String> list : partition) {
            System.out.println(list);
        }
    }

    public  List<List<String>> partition(String s) {
        backTracking(0,s);
        return result;
    }

    public static void backTracking(int start,String s){
        if(start>=s.length()){
            result.add(new LinkedList<String>(temp));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String substring = s.substring(start, i+1);
            if(ifPartition(substring)) {
                temp.add(substring);
                backTracking(i+1,s);
                temp.remove(temp.size()-1);
            }
            else {
                continue;
            }
        }
    }
//    判断是否回文
    public static boolean ifPartition(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
