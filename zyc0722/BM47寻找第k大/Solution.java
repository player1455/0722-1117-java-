import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param a int整型一维数组 
     * @param n int整型 
     * @param K int整型 
     * @return int整型
     */
    public int findKth (int[] a, int n, int K) {
        // write code here 堆的写法
        //ArrayList<Integer> List1 = new ArrayList<>();
        Queue<Integer> queue = new PriorityQueue<>((c,b)->b.compareTo(c));//大顶堆
        for(int i =  0;i<a.length;i++){
            queue.offer(a[i]);
        }
        int j = 0;
        while (j<K-1&&!queue.isEmpty()) {
            queue.poll();
            j++;
        }
        return queue.poll();
    }
}