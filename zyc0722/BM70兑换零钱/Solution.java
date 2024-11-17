import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 最少货币数
     * @param arr int整型一维数组 the array
     * @param aim int整型 the target
     * @return int整型
     */
    int ans = 0;
    public int minMoney (int[] arr, int aim) {
        // write code here
        if(aim==0){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            int ans = arr[i];
            ans = Math.min(aim, ans);
        }
        if(ans == aim){
            return -1;
        }
        int[] dp = new int[arr.length+1];
        
    }
}