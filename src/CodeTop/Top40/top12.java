package CodeTop.Top40;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 * 102. 二叉树的层序遍历
 */
public class top12 {

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root == null){
                return null;
            }

             List<List<Integer>> result = new ArrayList<>();
             LinkedList<TreeNode> queue = new LinkedList<>();
             queue.offer(root);

             while (!queue.isEmpty()){
                 int size = queue.size();
                 List<Integer> path = new ArrayList<>();
                 for(int i=0;i<size;i++){
                     TreeNode poll = queue.poll();
                     path.add(poll.val);
                     if(poll.left!=null){
                        queue.offer(poll.left);
                     }
                     if(poll.right!=null){
                         queue.offer(poll.right);
                     }
                 }
                 result.add(path);
             }
             return result;

        }
    }


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
}
