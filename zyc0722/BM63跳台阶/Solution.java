import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param number int整型 
     * @return int整型
     */
    int ans = 0;
    private void dfs(int n){
        if(n < 0){
            return;
    }
        if(n == 0){
            ans++;
            return;
    }
        for(int i = 0; i <= 2; i++){
            dfs(n - i);
    }
  }
    public int jumpFloor (int number) {
        // write code here
        dfs(number);
        return ans;
    }
}