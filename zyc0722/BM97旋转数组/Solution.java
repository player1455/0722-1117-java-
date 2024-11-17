import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     */
    public int[] solve (int n, int m, int[] a) {
        // write code here
       m = m % n;
       reverse(a,0,n-1);
       reverse(a,0,m-1);
       reverse(a,m,n-1);
       return a ;
    }
    public void reverse (int[]nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b] ;
        nums[b] = temp;
    }
}