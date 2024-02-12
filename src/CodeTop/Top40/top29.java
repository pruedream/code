package CodeTop.Top40;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 * 199. 二叉树的右视图
 *
 */
public class top29 {

    class Solution {

        public List<Integer> rightSideView(TreeNode root) {
          List<Integer> result = new ArrayList<>();
          if(root == null){
              return result;
          }
            LinkedList<TreeNode> q1 = new LinkedList<>();
          q1.offer(root);

          while (!q1.isEmpty()){
              int size = q1.size();
              for(int i=0;i<size;i++){
                  TreeNode poll = q1.poll();
                  if(i==size-1){
                      result.add(poll.val);
                  }

                  if(poll.left!=null){
                      q1.offer(poll.left);
                  }
                  if(poll.right!=null){
                      q1.offer(poll.right);
                  }

              }
          }
          return result;

        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
