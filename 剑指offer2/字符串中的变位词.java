package 剑指offer2;

import java.util.HashMap;

/**
 * @auther luyu
 */
public class 字符串中的变位词 {
//    这道题解题方法：双指针的方式，使用哈希表记录s1，因为是随机排列在s2出现，所以只要统计每个字符出现的次数即可
//    使用hash表存储次数，右指针向右遍历，出现一次就将出现次数-1，可以出现三种情况
//    1.某个字符的次数大于0，那么-1后继续遍历即可
//    2.某个字符的次数==0，说明前面出现过相同的字符，但是匹配串中的数量小于我们需要匹配的字符串的数量，因此让左指针右，相当于回溯我们减去的
//    字符出现次数
//    3.不存在当前字符，那就逻辑和2一样，left开始左移回溯之前减掉的次数
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }
            else {
                hashMap.put(c,1);
            }
        }
        int left = 0;
        int right = 0;
        while(left<=right&&right<s2.length()){
            Integer value = hashMap.getOrDefault(s2.charAt(right), null);
            if(value >=1){
                hashMap.put(s2.charAt(right),value-1);
                right++;
            }
            else if(value.equals(0)){
                while(left<=right&&hashMap.get(s2.charAt(right))==0){
                    hashMap.put(s2.charAt(left),hashMap.get(s2.charAt(left))+1);
                    left++;
                }
            }
            else {
                while(left<right){
                    hashMap.put(s2.charAt(left),hashMap.get(s2.charAt(left))+1);
                    left++;
                }
                right++;
                left=right;
            }
            if(right-left==s1.length()){
                return true;
            }
        }
        return false;
    }

}
