import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param str1 string字符串 
     * @param str2 string字符串 
     * @return int整型
     */
    public int editDistance (String str1, String str2) {
        // write code here
        int n1 = str1.length();
        int n2 = str2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=1;i<n1;i++){
            dp[i][0] = dp[i-1][0] +1 ;
        }
        for(int i=1;i<n2;i++){
            dp[0][i] = dp[0][i-1] +1;
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
               if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
               }else{
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
               }
            }
        }
        return dp[n1][n2];
    }
}