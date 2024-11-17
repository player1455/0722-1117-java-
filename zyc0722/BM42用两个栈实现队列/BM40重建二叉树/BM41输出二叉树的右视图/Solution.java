import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 求二叉树的右视图
     * @param preOrder int整型一维数组 先序遍历
     * @param inOrder int整型一维数组 中序遍历
     * @return int整型一维数组
     */
    public int[] solve (int[] preOrder, int[] inOrder) {
        // write code here
        TreeNode root = new TreeNode(preOrder[0]);
        int [] nums = new int[5];
        for (int i =0;i<inOrder.length;i++){
            if(preOrder[0]==inOrder[i]){
                root.left = reConstructBinaryTree(Arrays.copyOfRange(preOrder, 1, i),Arrays.copyOfRange(inOrder, 0, i-1));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(preOrder, i+1, preOrder.length),Arrays.copyOfRange(inOrder, i+1, inOrder.length));
                break;
            }
        }
        return root;
    }
}