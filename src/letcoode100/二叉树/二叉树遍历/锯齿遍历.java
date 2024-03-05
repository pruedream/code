package letcoode100.二叉树.二叉树遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author spike
 * @version 1.0.0
 *
 *
 *   遍历方式与层序遍历一致，只是在收集结果时要分从后放入与从前放
 */
public class 锯齿遍历 {


    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            if(root ==null){
                return  result;
            }
            int path = 0;
            LinkedList<TreeNode> qw = new LinkedList<TreeNode>();
            qw.offer(root);


            while(!qw.isEmpty()){
                int size = qw.size();
                LinkedList<Integer> q1 = new LinkedList<Integer>();

                for(int i=0;i<size;i++){
                    TreeNode we = qw.poll();
                    if(path == 0){
                        q1.offer(we.val);

                    }else{
                        q1.offerFirst(we.val);

                    }
                    if(we.left!=null){
                        qw.offer(we.left);
                    }
                    if(we.right!=null){
                        qw.offer(we.right);
                    }
                }
                path = path == 0 ? 1:0;
                result.add(q1);
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
