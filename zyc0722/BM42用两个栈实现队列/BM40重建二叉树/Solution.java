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
        if (preOrder.length==0||vinOrder.length==0){
            return null;
        }
        if (preOrder.length==1){
            return preOrder[0];
        }
        TreeNode root = new TreeNode(pre[0]);
        //Queue <TreeNode> queue = new ArrayDeque<>();
        //queue.offer(root);
        for(int i = 0;i<preOrder.length;i++){
            if(pre[0]==vin[i]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(preOrder, 1, i),Arrays.copyOfRange(inOrder, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(preOrder, i+1, preOrder.length),Arrays.copyOfRange(inOrder, i+1, inOrder.length));
                break;
            }
        }
        return root;
    }
}