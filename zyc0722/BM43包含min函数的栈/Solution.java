import java.util.*;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack2 = new Stack<Integer>();
    Stack<Integer> stack1 = new Stack<Integer>(); 
    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty()||node<stack2.peek()){
            stack2.push(node);
        }else{
            stack2.push(stack2.peek());
        }
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
       return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}
