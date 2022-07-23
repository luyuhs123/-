package 面试题;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @auther luyu
 */
public class _01判定字符是否唯一 {
    public boolean isUnique(String astr) {
        HashSet<Character> hashSet = new HashSet<>();
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(hashSet.contains(chars[i])){
                return false;
            }
            hashSet.add(chars[i]);
        }
        return true;
    }
}
