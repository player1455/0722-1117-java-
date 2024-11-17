import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param A string字符串 
     * @return int整型
     */
    int n;
    public int getLongestPalindrome (String A) {
        // write code here
        n = A.length();
        int ans =1;
        for(int i =0;i<n;i++){
            for(int j=n-1;j>i;j--){
                int left = i;
                int right = j;
                if(j-i+1<=ans){
                    break;
                }
                boolean flag = true;
                while(left<right){
                    if(A.charAt(left)!=A.charAt(right)){
                        flag = false;
                        break;
                    }
                    left++;
                    right--;
                }
                    if(flag){
                        ans = Math.max(ans,right-left+1);
                        break;
                    }
                }
        }
        return ans;
    }
}