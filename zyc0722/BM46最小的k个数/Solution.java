import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param input int整型一维数组 
     * @param k int整型 
     * @return int整型ArrayList
     */
    public ArrayList<Integer> GetLeastNumbers_Solution (int[] input, int k) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> queue = new PriorityQueue<>((a,b)->a.compareTo(b));
        int a = 0;
        for(int i = 0;i<input.length;i++){
                queue.offer(input[i]);
        }
        while(a!=k){
            arr.add(queue.poll());
            a++;
        }
        return arr;
    }
}