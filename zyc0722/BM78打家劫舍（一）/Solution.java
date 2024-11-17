import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param nums int整型一维数组 
     * @return int整型
     */
    int res = -1;
    public int rob (int[] nums) {
        // write code here
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[1] = nums[0];
        for(int i=2;i<=n;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i-1]);//num[i-1]是因为序号问题，因为是从1开始遍历的i-1是表示当前节点
            //dp中的序列与nums的序列不一样，，，dp[i-1]表示不偷   dp[i-2]+numsp[i-1]表示的是偷
        }
        return dp[n];
    }
}

//nums[1,2,3,4]   dp[3]  相当与 num[2] 时的最大金额 因为dp时从1开始遍历的，但是nums是从0开始遍历的
//dp[0,1,2,4,6]  i = 3     dp[3] = max(dp[2],dp[1] +num[2]) = 4   0(1) -> 1 / 1(1) - > 2 / 2(2) -> 4 / 3(3) -> 6    

//dp[0,1,2,4,6]  dp[3] = 4 = dp[1]+num[2] = 1 + 3 
//   0,1,2,3,4

//nums[1,2,3,4]
//     0,1,2,3