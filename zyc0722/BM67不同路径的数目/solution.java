import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param matrix int整型二维数组 the matrix
     * @return int整型
     */
    
    public int minPathSum (int[][] matrix) {
        // write code here
        int n = matrix.length;
        if(n==0){
            return 0;
        }
        int m = matrix[0].length;
        int [][] dp = new int[n+1][m+1];//每一个点的值
        for(int i=0;i<=n;i++){
            dp[i][1] = matrix[i-1][0] + dp[i-1][1];
        }
        for(int i=0;i<=m;i++){
            dp[1][i] = matrix[0][i-1] + dp[1][i-1];
        }
        for(int i=2;i<=n;i++){
            for(int j=2;j<=m;j++){
                dp[i][j] = matrix[i-1][j-1] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}