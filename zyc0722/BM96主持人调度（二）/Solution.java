import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算成功举办活动需要多少名主持人
     * @param n int整型 有n个活动
     * @param startEnd int整型二维数组 startEnd[i][0]用于表示第i个活动的开始时间，startEnd[i][1]表示第i个活动的结束时间
     * @return int整型
     */
    public int minmumNumberOfHost (int n, int[][] startEnd) {
        // write code here
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i=0;i<n;i++){
            start[i] = startEnd[i][0];
            end[i] = startEnd[i][1];
        }
        Arrays.sort(start,0,start.length);
        Arrays.sort(end,0,end.length);
        int res = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            if(start[i]>end[j]){
                j++;
            }else{
                res++;
            }
        }
        return res;
    }    
}