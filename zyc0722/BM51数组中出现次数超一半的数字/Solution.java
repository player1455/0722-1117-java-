import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param numbers int整型一维数组 
     * @return int整型
     */
    public int MoreThanHalfNum_Solution (int[] numbers) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<numbers.length;i++){
           if(!map.containsKey(numbers[i])){
               map.put(numbers[i], 1);
           }else{
                map.put(numbers[i], map.get(numbers[i])+1);
           }
           if (map.get(number[i])>numbers.length/2){
                return number[i];
           }
        }
        return 0 ;
    }
}