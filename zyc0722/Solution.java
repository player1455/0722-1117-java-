import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param matrix int整型二维数组 the matrix
     * @return int整型
     */
    int n;
    int m ;
    int ans = 0;
    public int minPathSum (int[][] matrix) {
        // write code here
        n = matrix.length;
        m = matrix[0].length; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0&&j==0){
                    continue;
                }
                if(i==0){
                    ans += matrix[i][j-1];
                }else if(j==0){
                    ans += matrix[i-1][j];
                }else{
                    ans += Math.min(matrix[i][j-1], matrix[i-1][j]);
                }
            }
        }
        return ans ;
    }
}