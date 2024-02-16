package CodeTop.Top40;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 * 103. 二叉树的锯齿形层序遍历
 *
 */
public class top13 {

    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
             List<List<Integer>> result = new ArrayList<>();

             LinkedList<TreeNode> path = new LinkedList<>();
             path.add(root);
             boolean lr = true; // true 为左到右 ,反之

            while (!path.isEmpty()){
                int size = path.size();
                LinkedList<Integer> re = new LinkedList<>();
                for(int i=0;i<size;i++){
                    TreeNode poll = path.poll();
                    if(lr){
                        re.offerLast(poll.val);
                    }else {
                        re.offerFirst(poll.val);
                    }


                    if(poll.left!=null){
                        path.offer(poll.left);
                    }
                    if(poll.right!=null){
                        path.offer(poll.right);
                    }

                }

                result.add(re);
                lr = !lr;

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
