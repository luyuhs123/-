package backTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther luyu
 * 复原ip地址  给定一个ip地址字符串，找出他可能的所有组合，大小为0~255，可以为0 ，但不能以0开头
 */
public class _93Problem {
//    static StringBuilder temp = new StringBuilder();
//    static List<String> result = new ArrayList<>();
////    public List<String> restoreIpAddresses(String s) {
////        backTracking(s,0);
////    }
//
//    public void backTracking(String s,int startIndex){
//        int endIndex = startIndex+2;
//        if(s.length()-1<endIndex){
//            return;
//        }
//        if(temp.length()==4&&startIndex==s.length()-1){
//            result.add(temp.toString());
//            return;
//        }
//
//        for (int i = startIndex; i <= endIndex; i++) {
//            String substring = s.substring(startIndex, i + 1);
//            if(ifBetween(substring)){
//                temp.append(substring).append('.');
//                backTracking(s,i+1);
//                temp.delete();
//            }
//            else break;
//        }
//
//    }
//
////    判断由切割的字符串转为的数字是否在0~255之间
//    public boolean ifBetween(String s){
//        if(s.length()>=2&&s.startsWith("0")){
//            return false;
//        }
//        try {
//            int i = Integer.parseInt(s);
//            if(i>=0)
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            return false;
//        }
//
//    }
}
