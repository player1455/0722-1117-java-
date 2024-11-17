import java.util.*;

import javax.swing.tree.TreeNode;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param preOrder int整型一维数组 
     * @param vinOrder int整型一维数组 
     * @return TreeNode类
     */
    public TreeNode reConstructBinaryTree (int[] preOrder, int[] vinOrder) {
        // write code here
        if (root==null){
            return null;
        }
        if(preOrder.length==1){
            return root;
        }
        Queue <TreeNode> queue = new ArrayDeque<>();
        List <Integer> List = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.left==null){
                List.add('#');
            }else{
                queue.offer(node.left);
                List.add(node.left.val);
            }
            if (node.right==null){
                List.add('#');
            }else{
                queue.offer(node.right);
                List.add(node.right.val);
            }
        }
        return List;
    }
    public search_root(int[]preOrder,int[]vinOrder){
        
    }
}



