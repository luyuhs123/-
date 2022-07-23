package 剑指offer;

/**
 * @auther luyu
 */
public class Six {
    public String reverseLeftWords(String s, int n) {
        String substring = s.substring(0, n);
        String substring1 = s.substring(n);
        return substring1+substring;
    }
}
