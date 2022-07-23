package backTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther luyu
 *
 *电话号码字母组合问题，使用回溯法求解
 */
public class _17Problem {
    static StringBuffer sb = new StringBuffer();
    static List<String> result = new ArrayList<>();
    static HashMap<Character,List<Character>> reflect = new HashMap<>();
    static {
        char start = 'a';
        for (char i = '2'; i <= '9'; i++) {
            List<Character> characters = new ArrayList<>();
            if(i=='7'||i=='9'){
                for (int j = 0; j < 4; j++) {
                    characters.add(start++);
                }
            }
            else {
                for (int j = 0; j < 3; j++) {
                    characters.add(start++);
                }
            }
            reflect.put(i,characters);
        }
    }
    public static void main(String[] args) {
        String digits = "23";
        _17Problem problem = new _17Problem();
        List<String> list = problem.letterCombinations(digits);
        for (String s : list) {
            System.out.println(s);
        }

    }
    public List<String> letterCombinations(String digits) {
        result.clear();
        if(digits==null||digits.length()==0){
            return new ArrayList<String>();
        }
        backTracking(digits.length(),digits,0);
        return result;
    }

    /**
     * 
     *
     * @param length 每个组合的长度，即输入的字符串长度。也是终止条件
     */
    public void backTracking(int length,String s,int startIndex){
        if(sb.length()==length){
            result.add(sb.toString());
            return;
        }
        char c = s.charAt(startIndex);
        List<Character> characters = reflect.get(c);
        for (int i = 0; i < characters.size(); i++) {
            sb.append(characters.get(i));
            backTracking(length,s,startIndex+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
