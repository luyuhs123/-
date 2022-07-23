package 剑指offer;

import java.util.*;

/**
 * @auther luyu
 */
public class _50第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        LinkedHashMap<Character,Boolean> hashMap = new LinkedHashMap();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            hashMap.put(aChar,!hashMap.containsKey(aChar));
        }
        for (Map.Entry<Character, Boolean> characterBooleanEntry : hashMap.entrySet()) {
            if(characterBooleanEntry.getValue()){
                return characterBooleanEntry.getKey();
            }
        }
        return ' ';
    }
}
