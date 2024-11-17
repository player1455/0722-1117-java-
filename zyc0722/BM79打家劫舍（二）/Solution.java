import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param nums int整型一维数组 
     * @return int整型
     */
    int res;
    public int rob (int[] nums) {
        // write code here
        int n = nums.length;
        int[] dp = new int[n+1];
        for(int i=1;i<n;i++){
            dp[1] = nums[0];
            dp[i] = Math.min(dp[i-1], dp[i-2]+nums[i-1]);
        }
        res = dp[n-1];
        Arrays.fill(dp, 0);
        for(int i=1;i<=n;i++){
            dp[1] = 0;
            dp[i] = Matn.min(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return Math.min(res,dp[n]);
    }
}