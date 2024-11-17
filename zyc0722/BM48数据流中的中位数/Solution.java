import java.util.*;


public class Solution {

    public void Insert(Integer num) {
      int index = BinarySaerch(num);
      list1.add(index, num);
    }
    public Double GetMedian() {
        if(list1.isEmpty()){
          return 0.0;
        }
        if(list1.size()%2==0){
          double ans = (double) (list1.get(list1.size()/2-1)+list1.get(list1.size()/2));
          return ans/2;
        }else{
          return Double.valueOf(list1.get(list1.size()/2));
        }
    }
    List <Integer> list1 = new ArrayList<>() ;
    public int  BinarySaerch(int value){
      if(list1.isEmpty()){
        return 0 ;
      }
      int left = 0;
      int right = list1.size();
      int mid ;
      while (left<right){
        mid = left+(right-left)/2;
        if(value>list1.get(mid)){
          left = mid + 1;
        }else{
          right = mid ;
        }
      }
      return right ;
    }
}
