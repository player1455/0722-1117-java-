import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 解码
     * @param nums string字符串 数字串
     * @return int整型
     */
    public int solve (String nums) {
        // write code here
        if(nums=='0'){
            return 0;
        }
        for(int i =1;i<nums.length();i++){
            if(nums.charAt(i)=="0"){
                if(nums.charAt(i-1)!="1"||nums.charAt(i-1)!="2"){
                    return 0;
                }
            }
        }
        int[] dp = new int[nums.length()+1];
        Arrays.fill(1, dp);
        for(int i=2;i<=nums.length();i++){//为何是小于等于nums.length()
            if(nums.charAt(i-2)=="1"&&nums.charAt(i-1)!="0"||nums.charAt(i-2)=="2"&&nums.charAt(i-1)!="0"){
                dp[i] = dp[i-2] +dp[i-1];
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[nums];
    }
}