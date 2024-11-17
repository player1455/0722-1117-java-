import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param height int整型一维数组 
     * @return int整型
     */
    public int maxArea (int[] height) {
        // write code here
        int left = 0;
        int right = height.length-1;
        int res = 0 ;
        while (left<right) {
            int cap  = (right - left)*Math.min(height[right], height[left]);
            res = Math.max(res,cap);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}