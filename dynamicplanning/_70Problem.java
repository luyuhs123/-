package dynamicplanning;

/**
 * @auther luyu
 * 爬楼梯问题   每次只能走一格或者两格，走上m级楼梯有几种方法
 * 使用的是动态规划算法
 * 动态规划五步走
 */
public class _70Problem {
    public int climbStairs(int n) {
        if(n<=1){
            return n;
        }
//        1.确定dp[]数组，而且明确dp数组的含义，比如这里，dp[]代表爬i级楼梯的方法数
        int[] dp = new int[n+1];
//        2.找到递推公式  分析一下。这里爬到3级楼梯的方法数可以是2级楼梯爬一步或者1级楼梯爬两步
//        因此找到的公式应该是 dp[i] = dp[i-1]+dp[i-2]
//        3.dp数组初始化  爬的楼梯数>0 得从三级楼梯开始遍历
        dp[1]=1;
        dp[2]=2;
//        4.确定遍历顺序,从公式可看出是从前往后遍历
//        5.举例推导一遍,比如当n=5时  dp[]数组为1,2,3,5,8
        for (int i = 3; i <= n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
