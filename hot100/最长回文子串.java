package hot100;

import java.util.Arrays;

/**
 * @auther luyu
 */
public class 最长回文子串 {
    public static void main(String[] args) {
        String bcdd = longestPalindrome("bcdd");
        System.out.println(bcdd);
    }
    public static String longestPalindrome(String s) {
        if(s==null||s.length()<2){
            return s;
        }
        //1.动态规划，回文子串特征是头和尾必须相同，那么我们的转移方程就是dp[i][j]==dp[i+1][j-1] and s[i]==s[j]
        // 即大的串要是回文串那么掐头去尾以后的小子串也得是回文串 这些都是基于串的长度大于2时考虑的，<=2还分情况
        //dp方程i，j就是子串下表
        boolean[][] dp = new boolean[s.length()][s.length()];
        int maxLength=1;
        int start=0;
        for (int r = 1; r < dp.length; r++) {
            for(int l = 0;l<r;l++){
                if(s.charAt(r)==s.charAt(l)&&(dp[l + 1][r - 1] ||r-l<3)){
                    dp[l][r]=true;
                    if((r-l+1)>maxLength){
                        maxLength=r-l+1;
                        start=l;
                    }
                }
            }
        }
        return s.substring(start,start+maxLength);
    }
}
