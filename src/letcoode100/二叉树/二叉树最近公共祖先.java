package letcoode100.二叉树;

/**
 * @author spike
 * @version 1.0.0
 *
 * 236. 二叉树的最近公共祖先
 */
public class 二叉树最近公共祖先 {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q){
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);

            if(left == null && right == null){
                return null;
            }else if(left == null && right !=null){
                return right;
            }else if(left != null && right == null){
                return left;
            }else {
                return root;
            }

        }
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
}
