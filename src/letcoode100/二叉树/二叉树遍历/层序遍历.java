package letcoode100.二叉树.二叉树遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 */
public class 层序遍历 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if(root == null){
                return result;
            }
            LinkedList<TreeNode> path = new LinkedList<TreeNode>();
            path.offer(root);

            while(!path.isEmpty()){
                int size = path.size();
                List<Integer> op = new ArrayList<Integer>();
                for(int i=0;i<size;i++){
                    TreeNode q1 = path.poll();
                    op.add(q1.val);
                    if(q1.left!=null){
                        path.offer(q1.left);
                    }
                    if(q1.right!=null){
                        path.offer(q1.right);
                    }
                }
                result.add(op);
            }


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
