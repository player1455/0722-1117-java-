import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param num int整型一维数组 
     * @return int整型ArrayList<ArrayList<>>
     */
    ArrayList<ArraysList<Integer>> ans;
    Set<String> set = new HashSet<>();
    public void dfs(int count,int[]nums,bollen[] isVisited,ArrayList<Integer> list){
        if(count==nums.length){
            StringBuffer sb = new SringBuffer();
            for(Integer integer:list){
                sb.append(integer);
            }
            set.add(sb.toString());
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0 ;i<nums.length;i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                list.add(num[i]);
                dfs(count+1, nums, isVisited, list);
                isVisited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> permuteUnique(int[]num){
        ans = new ArrayList<>();
        Arrays.sort(num);
        int n = num.length;
        boolean[]isVisited = new boolean[n];
        dfs(0, num, isVisited, new ArraysLiat<>());
        return ans;
    }
}