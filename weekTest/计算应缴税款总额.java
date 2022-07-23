package weekTest;

/**
 * @auther luyu
 */
public class 计算应缴税款总额 {
    public static void main(String[] args) {
        int[][] brackets = {{3,50},{7,10},{12,25}};
        int income = 10;
        calculateTax(brackets,income);
    }
    public static double calculateTax(int[][] brackets, int income) {
        double sum = 0;
        int i = 0;
        for (i = 0; i < brackets.length-1; i++) {
            if(income-brackets[i][0]<0){
                break;
            }
            if(i==0){
                sum+= brackets[i][0]*((double)brackets[i][1]/100);
            }else {
                sum+= (brackets[i][0]-brackets[i-1][0])*((double)brackets[i][1]/100);
            }

        }
        if(i<brackets[i-1][0]){
            sum+=(income)*((double)brackets[i][1]/100);
        }
        else {
            sum+=(income-brackets[i-1][0])*((double)brackets[i][1]/100);
        }
        return sum;
    }
}
