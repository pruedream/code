package letcoode100.二叉树;

import javax.swing.tree.TreeNode;

/**
 * @author spike
 * @version 1.0.0
 * <p>
 * <p>
 * 543. 二叉树的直径
 */
public class 二叉树的直径 {

    class Solution {
        int max = 1;

        public int diameterOfBinaryTree(TreeNode root) {
            ok(root);
            return max - 1;
        }
//该递归函数根据处理 处理逻辑可知：ok函数将会把参数root作为连接点，链接左右子树形成的长度与max比较
        // 使max保持最大，之后将返回左右子树中长度最长的长度
        public int ok(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = ok(root.left);
            int right = ok(root.right);
            max = Math.max(max, left + right + 1);
            return Math.max(left, right) + 1;
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
