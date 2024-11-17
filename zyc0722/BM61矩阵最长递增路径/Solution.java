import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 递增路径的最大长度
     * @param matrix int整型二维数组 描述矩阵的每个数
     * @return int整型
     */
    int[][] dis = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    int ans = -1;
    
    public int solve (int[][] matrix) {
        // write code here
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] isVisited = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                dfs(matrix, isVisited,1, i, j);
            }
        }
        return ans;
    }
    private void dfs(int[][] matrix,boolean[][]isVisited,int count,int x,int y ) {
        ans = Math.max(ans, count);
        for(int i = 0;i<4;i++){
            int nextX = x+dis[i][0];
            int nextY = y+dis[i][1];
            if(matrix[x][y]<matrix[nextX][nextY]&&nextX>=0&&nextX<matrix.length&&nextY<matrix[0].length&&nextY>=0&&!isVisited[nextX][nextY]){
                isVisited[nextX][nextY] = true;
                dfs(matrix,isVisited,count+1,nextX, nextY);
                isVisited[nextX][nextY] = false;
            }
        }
    }
}