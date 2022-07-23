package 剑指offer;

/**
 * @auther luyu
 */
public class 把数字翻译成字符串 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] dp = new int[s.length()];
        dp[0] = 1;
        String s1 = s.substring(0, 2);
        if(Integer.parseInt(s1)<=25){
            dp[1] = 2;
        }
        else {
            dp[1] = 1;
        }
        for (int i = 2; i < s.length(); i++) {
            String temp = s.substring(i-1, i+1);
            if(Integer.parseInt(temp)<=25&&!temp.startsWith("0")){
                dp[i] = dp[i-1]+dp[i-2];
            }
            else {
                dp[i] = dp[i-1];
            }
        }
        return dp[s.length()-1];
    }
}
