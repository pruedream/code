package letcoode100.二叉树;

/**
 * @author spike
 * @version 1.0.0
 */
public class 二叉树中的最大路径和 {
    class Solution {
        int max = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            ok(root);
            return max;
        }



        public int ok(TreeNode root){
            if(root ==null){
                return 0;
            }

            int left= ok(root.left);
            int right= ok(root.right);

            left = Math.max(left,0);
            right = Math.max(right,0);

            max = max < (left+right+root.val) ? (left+right+root.val):max;

            return  Math.max(left,right)+root.val;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

}
