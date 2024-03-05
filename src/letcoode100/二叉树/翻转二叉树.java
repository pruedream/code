package letcoode100.二叉树;

/**
 * @author spike
 * @version 1.0.0
 */
public class 翻转二叉树 {


    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root == null){
                return root;
            }

            TreeNode q1 = root.left;
            root.left = root.right;
            root.right = q1;

            invertTree(root.left);
            invertTree(root.right);

            return root;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
