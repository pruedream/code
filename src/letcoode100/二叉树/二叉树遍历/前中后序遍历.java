package letcoode100.二叉树.二叉树遍历;


import java.util.ArrayList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 */
public class 前中后序遍历 {

    class Solution {
        List<Integer> result = new ArrayList<Integer>();

        public List<Integer> inorderTraversal1(TreeNode root) {
            if(root == null){
                return result;
            }
            result.add(root.val);
            inorderTraversal1(root.left);
            inorderTraversal1(root.right);

            return result;
        }





        public List<Integer> inorderTraversal2(TreeNode root) {
            if(root == null){
                return result;
            }
            inorderTraversal2(root.left);
            result.add(root.val);
            inorderTraversal2(root.right);

            return result;
        }



        public List<Integer> inorderTraversal3(TreeNode root) {
            if(root == null){
                return result;
            }
            inorderTraversal3(root.left);

            inorderTraversal3(root.right);
            result.add(root.val);

            return result;
        }

    }


      public class TreeNode {
           int val;
           TreeNode left;
          TreeNode right;
           TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
              this.left = left;
             this.right = right;
         }
     }
}
