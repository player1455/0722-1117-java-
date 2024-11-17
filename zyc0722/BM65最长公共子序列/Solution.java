import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * longest common subsequence
     * @param s1 string字符串 the string
     * @param s2 string字符串 the string
     * @return string字符串
     */
    public String LCS (String s1, String s2) {
        // write code here
        if (s1.length()==0||s2.length()==0){
            return "-1";
        }
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<s1.length();i++){
            for(int j =0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    sb.append(s1.charAt(i));
                    continue;
                }else if()
            }
        }
    }
}