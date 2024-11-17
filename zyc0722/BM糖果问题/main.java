import java.util.HashMap;
import java.util.Map;

class Solution {
    public int candy(int[] ratings) {
        int count = 0;
        Map<Integer,Integer >map = new HashMap<>();
        for(int i=0;i<ratings.length;i++){
            map.put(ratings[i], 1);
            count += ratings.length;
        }
        for(int j=1;j<ratings.length;i++){
            if(ratings[j]>ratings[j-1]||ratings[j]>ratings[j+1]){
                int value = map.get(ratings[i])+1 ;
                map.put(ratings[j],value);
                count += 1;
            }
        }
        return count ;
    }
}



