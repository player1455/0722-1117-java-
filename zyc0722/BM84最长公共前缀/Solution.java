import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param strs string字符串一维数组
     * @return string字符串
     */
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if (strs.length == 0) {
            return " ";
        }
        int rows = strs.length;//行
        int cols = strs[0].length();//列
        for (int i = 0; i < cols; i++) {
            char firstChar = strs[0].charAt(i);
            for (int j = 1; j < rows; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != firstChar) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}