import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param s string字符串 
     * @return string字符串ArrayList
     */
    public boolean testString(String s){
        int n = s.length();
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(s.charAt(0)=='0'){
            return false;
        }
        return Integer.valueOf(s) <= 255;
    }
    public ArrayList<String> restoreIpAddresses (String s) {
        // write code here
       ArrayList<String> res = new ArrayList<>();
       int n = s.length();
       for(int i=1;i<=n;i++){
            if(i>=4){
                break;
            }
            for(int j=i+1;i<=n;j++){
                if(j-i>=4){
                    break;
                }
                for(int k=j+1;k<=n;k++){
                    if(k-j>=4){
                        break;
                    }
                    if(n-k>=4){
                        continue;
                    }
                    String s1 = s.substring(0,i);
                    String s2 = s.substring(i,j);
                    String s3 = s.substring(j,k);
                    String s4 = s.substring(k,n);
                    if(testString(s1)&&testString(s2)&&testString(s3)&&testString(s4)){
                        res.add(s1+'.'+s2+'.'+s3+'.'+s4);
                    } 
                }
            }
       }
       return res;
    }
}