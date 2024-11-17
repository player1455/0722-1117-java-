import java.util.*;


public class Solution {
    Map<Integer,Integer> map;
    Deque<Integer> list;
    int capacity;
 public Solution(int capacity) {
 // write code here
    map = new HashMap<>();
    list = new LinkeaListed<>();
    this.capacity = capacity;
 }

 public int get(int key) {
 // write code here
  if(map.containsKey(key)){
    list.remove(key);
    list.addFirst(key);
    return map.get(key);
  }
  return -1;
 }

 public void set(int key, int value) {
 // write code here
 if(map.containsKey(key)){
    map.put(key,value);//更新哈希表中的value值
    list.remove(key);
    list.addFirst(key);
 }else{
    if(list.size()<capacity){
        list.addFirst(key);
        map.put(key,value);
    }else{
        int temp = list.getLast();
        list.removeLast();
        map.remove(temp);
        list.addFirst(key);
        map.put(key, value);
    }
 }
 }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution solution = new Solution(capacity);
 * int output = solution.get(key);
 * solution.set(key,value);
 */