package hot100;

import java.util.HashSet;

/**
 * @auther luyu
 */
public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int longest = Integer.MIN_VALUE;
        int left=0;
        int right = 0;
        while(right< chars.length){
            if(!set.contains(chars[right])){
                set.add(chars[right]);
                right++;
            }
            else {
                longest=Math.max(longest,right-left+1);
                while(set.contains(chars[right])){
                    set.remove(chars[left]);
                    left++;
                }
            }
        }
        return longest;
    }
}
