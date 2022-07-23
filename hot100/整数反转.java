package hot100;

/**
 * @auther luyu
 */
public class 整数反转 {
    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int pop = x%10;
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE&&pop>7)){
                return 0;
            }
            if(res<Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE&&pop<-8)){
                return 0;
            }
            res=res*10+pop;
            x/=10;
        }
        return res;
    }
}
