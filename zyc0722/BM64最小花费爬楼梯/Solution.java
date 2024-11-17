import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param cost int整型一维数组 
     * @return int整型
     */
    int ans = Integer.MAX_VALUE;
    private void dfs(int nums[],int index,int value){
            if(index==nums.length){
                ans = Math.min(ans, value);
                return;
            }
            if(index>nums.length){
                return;
            }
            for(int i = 0;i <= 2;i++){
                dfs(nums, index+i, value+nums[index]);
            }
    }
    public int minCostClimbingStairs (int[] cost) {
        // write code here
        int n = cost.length;
        if(n==1){
            return cost[0];
        }
        dfs(cost, 0, 0);
        dfs(cost, 1, 0);
        return ans;
    }
}