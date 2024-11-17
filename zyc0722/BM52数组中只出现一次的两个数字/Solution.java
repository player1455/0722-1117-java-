import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param nums int整型一维数组 
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] nums) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        //int [] arr = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for (int j = 0;j<nums.length;j++){
            if (map.get(nums[j])==1) {
                list.add(nums[j]);
            }
        }
        if(list.get(0)>list.get(1)){
            return new int[]{list.get(1),list.get(0)};
        }else{
            return new int[]{list.get(0),list.get(1)};
        }
    }
}