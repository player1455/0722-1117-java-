import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param num int整型一维数组 
     * @return int整型ArrayList<ArrayList<>>
     */
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> permute (int[] num) {
        // write code here
        LinkedList<Integer> list = new LinkedList<>();
        backTrack(num,list);
        return res;
    }

    public void backTrack(int[]num,LinkedList<Integer> list){
        if(list.size()==num.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<num.length;i++){
            if(list.contains(num[i]))
                continue;
            list.add(num[i]);
            backTrack(num, list);
            list.removeLast();
        }
    }
}