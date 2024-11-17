import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param m int整型 
     * @param n int整型 
     * @return int整型
     */
    int [][] dis = new int[][]{{-1,0},{0,1},{0,-1}};
    Set <Integer> set = new HashMap<>();
    public int uniquePaths (int m, int n) {
        // write code here
    }
    private void dfs(int x,int y){
        for(int i =0;i<4;i++){
            int nx = dis[i][0] + x;
            int ny = dis[0][i] + y;
        }
    }
}