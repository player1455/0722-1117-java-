import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param str string字符串 
     * @return string字符串ArrayList
     */
    
    Set<String> set = new HashSet<>();
    public ArrayList<String> Permutation (String str) {
        // write code here
        char[] chs = str.toCharArray();
        boolean[] isVisited = new boolean[chs.length];
        dfs(chs, new StringBuffer(), isVisited);
        return new ArrayList<>(set);
    }
    public void dfs(char[] chs,StringBuffer sb ,boolean[]isVisited) {
       if(sb.length()==chs.length){
        set.add(sb.toString());
        return;
       }
        for(int i = 0;i<chs.length;i++){
            if(!isVisited[i]){
                isVisited[i] =  true;
                sb.append(chs[i]);
                dfs(chs, sb, isVisited);
                sb.deleteCharAt(sb.length()-1);
                isVisited[i] = false;
            }
        }
    }
    
}