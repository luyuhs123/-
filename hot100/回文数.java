package hot100;

import java.util.Stack;

/**
 * @auther luyu
 */
public class 回文数 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = x;
        int res=0;
        while(temp!=0){
            int pop = temp % 10;
            res=res*10+pop;
            temp/=10;
        }
        if(res==x){
            return true;
        }
        return false;
    }
}
