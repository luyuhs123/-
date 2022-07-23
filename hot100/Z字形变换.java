package hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther luyu
 */
public class Z字形变换 {
    public String convert(String s, int numRows) {
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        char[] chars = s.toCharArray();
        int flag=-1;
        int cur=0;
        for (int i = 0; i < chars.length; i++) {
            list.get(i).append(chars[i]);
            if(cur==0||cur==numRows-1){
                flag=-flag;
            }
            cur+=flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder stringBuilder : list) {
            res.append(stringBuilder);
        }
        return res.toString();
    }
}
