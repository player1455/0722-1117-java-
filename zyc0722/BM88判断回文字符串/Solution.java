import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param str string字符串 待判断的字符串
     * @return bool布尔型
     */
    public boolean judge (String str) {
        // write code here
        if(str.length()==1){
            return true;
        }
        int l = 0;
        int r = str.length()-1;
        while(l>=r){
            if(str.charAt(l)==str.charAt(r)){
                l += 1;
                r -= 1;
            }else{
                return false;
        }
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println("wtf");
  }
}