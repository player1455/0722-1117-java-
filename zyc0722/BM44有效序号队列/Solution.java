import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param s string字符串 
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        // write code here
        Stack<String> Stack1 = new Stack<>();
        Map<Charater, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Stack1.isEmpty()){
                Stack1.push(ch);
            }else{
                if(map.containsKey(ch)){
                    if(Stack1.peek()==map.get(ch)){
                        Stcak1.pop();
                    }else{
                        return false;
                    }
                }else{
                    Stack1.push(ch);
                }
            }
        }
    }
    return Stack1.isEmpty();
}
