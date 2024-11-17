import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param mat int整型二维数组 
     * @param n int整型 
     * @return int整型二维数组
     */
    public int[][] rotateMatrix (int[][] mat, int n) {
        // write code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               int[][] temp = new int[n][n];
               temp[j][n-1-i] = mat[i][j]; 
            }
        }
        return temp;
    }
}