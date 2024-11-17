import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @param n int整型
     * @return string字符串
     */
    public String trans (String s, int n) {
        // write code here
        if (n == 0) {
            return s;
        }
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                res.append((char)(s.charAt(i) - 'A' + 'a'));
            }
            else if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a') {
                res.append((char)(s.charAt(i) - 'a' + 'A'));
            }else{
                res.append(s.charAt(i));
            }
        }
        //res.toString();
        res = res.reverse();
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && res.charAt(j) !=' ') 
                j++;{
                String temp = res.substring(i, j);
                StringBuffer buffer = new StringBuffer(temp);
                temp = buffer.reverse().toString();
                res.replace(i, j, temp);
                i = j;
                }
            
        }
        return res.toString();
    }
}