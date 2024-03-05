package letcoode100.二叉树;

/**
 * @author spike
 * @version 1.0.0
 */
public class 二叉树的最大深度 {


    class Solution {
        /**
         * 前序
         */
        int max = 0;
        int count =0;
        public int maxDepth(TreeNode root) {
            if(root == null){
                return max;
            }
            count++;
            max = max < count ? count:max;
            maxDepth(root.left);
            maxDepth(root.right);
            count--;

            return max;
        }

        /**
         * 后序
         * @param root
         * @return
         */


        public int maxDepth1(TreeNode root) {
            if(root == null){
                return 0;
            }

            int left= maxDepth1(root.left);
            int right= maxDepth1(root.right);
            return Math.max(left,right)+1;
        }
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
}
