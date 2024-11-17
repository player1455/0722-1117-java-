import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        // write code here
        if(arr.length==1){
            return 1;
        }
        int max = 0;
        HashMap map = new HashMap<>();
        for(int i=0,j=0;i < arr.length;++i){
            if(map.containsKey(arr[i])){
                j = Math.max(j, map.get(arr[i]+1));
            }
            map.put(arr[i],i);
            max = Math.max(max, i-j+1);
        }
        return max ;
    }
}