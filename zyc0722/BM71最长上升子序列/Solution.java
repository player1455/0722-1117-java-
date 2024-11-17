import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 给定数组的最长严格上升子序列的长度。
     * @param arr int整型一维数组 给定的数组
     * @return int整型
     */
    public int LIS (int[] arr) {
        // write code here
        if (arr.length == 0) {
            return 0;
        }
        int[] dp = new int[arr.length + 1]; //最长上升序列的长度
        Arrays.fill(dp, 1);
        for (int i = 1; i <= arr.length; i++) {
            //dp[i] = 1;
            for(int j = 1; j < i; j++) {
                if(arr[j-1] < arr[i-1]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}