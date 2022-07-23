package string;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther luyu
 * 求一个字符串能否由其中的一个子串重复构成
 * 看见重复字符串第一时间先想到KMP
 */
public class _459Problem {
    public boolean repeatedSubstringPattern(String s) {
        int[] next = getNext(s);
        if(s==null||s.length()==0||s.length()==1){
            return false;
        }
        if(s.length()%(next.length-next[next.length-1]-1)==0){
            return true;
        }
        return false;

    }
    public int[] getNext(String s){
        int[] nextTable = new int[s.length()];
//        j不仅用来计数，还用来回溯找到最长前缀的位置
        int j = -1;
//        初始化
        nextTable[0]=-1;
        for (int i = 1; i < s.length(); i++) {
            while(j>=0&&s.charAt(j+1)!=s.charAt(i)){
                j = nextTable[j];
            }
            if(s.charAt(j+1)==s.charAt(i)){
                j++;
            }
            nextTable[i]=j;
        }
        return nextTable;
    }
}
