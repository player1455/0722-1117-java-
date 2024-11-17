import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 验证IP地址
     * @param IP string字符串 一个IP地址字符串
     * @return string字符串
     */
     public String solve (String IP) {
        // write code here
        String[] res = IP.split("\\.");
        if (res.length == 4) {
            for(int i=0; i < 4; i++) {
                for(int j=0; j < res[i].length(); j++) {
                    char ch = res[i].charAt(j);
                    if(ch <='0' || ch > '9') {
                        return "Neither";
                    }
                };
            }//char valueof -> integer
            for (int i = 0; i < 4; i++) {
                int value = Integer.parseInt(res[i]);
                if (value > 0 && value <= 255) {
                    continue;
                } else {
                    return "Neither";
                }
            }
            return "IPv4";
        }
        String[] ans = IP.split(":",-1);
        //如果 limit > 0,(从左到右)最多分割 n - 1 次,数组的长度将不会大于 n,结尾的空字符串不会丢弃
        //如果 limit < 0,匹配到多少次就分割多少次,而且数组可以是任何长度。结尾的空字符串不会丢弃
        //如果 limit = 0,匹配到多少次就分割多少次,数组可以是任何长度,并且结尾空字符串将被丢弃
        if(ans.length!=8){
            return "Neither";
        }
        for(int i = 0; i < ans.length; i++){
            if(ans[i]==null){
                return "Neither";
            }
            if(ans[i].length()==0||ans[i].length()>4){
                return "Neither";
            }
            for(int j = 0; j < ans[i].length(); j++){
                char ch = ans[i].charAt(j);
               boolean expr = (ch>='0'&&ch<='9') || (ch>='a'&&ch<='f') || (ch>='A'&&ch<='F');
               if(!expr){
                    return "Neither";
               }
            }
        }
        return "IPv6";//Neither
    }

}