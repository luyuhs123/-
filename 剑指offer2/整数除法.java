package 剑指offer2;

/**
 * @auther luyu
 */
public class 整数除法 {
    public int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1)
        {return Integer.MAX_VALUE;}
        int sign = (a > 0) ^ (b > 0) ? -1 : 1;
        // 环境只支持存储 32 位整数
        if (a > 0) {a = -a;}
        if (b > 0) {b = -b;}
        int res = 0;
        while (a <= b) {
            a -= b;
            res++;
        }
        // bug 修复：因为不能使用乘号，所以将乘号换成三目运算符
        return sign == 1 ? res : -res;
    }
}
