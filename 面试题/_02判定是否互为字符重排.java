package 面试题;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @auther luyu
 */
public class _02判定是否互为字符重排 {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer time = hashMap.getOrDefault(chars[i], 0);
            hashMap.put(chars[i],time+1);
        }
        for (int i = 0; i < chars1.length; i++) {
            if(!hashMap.containsKey(chars1[i])){
                return false;
            }
            else {
                Integer integer = hashMap.get(chars1[i]);
                if(integer==1){
                    hashMap.remove(chars1[i]);
                }
                else {
                    hashMap.put(chars1[i],integer-1);
                }
            }
        }
        if(hashMap.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
