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
             if(root == null){
                 return result;
             }
            LinkedList<TreeNode> path1 = new LinkedList<>();//栈
             LinkedList<TreeNode> path2 = new LinkedList<>();// 队列
             path1.push(root);
             int jk=0;//0表示本层加入元素使用的结构是栈
             while (!path1.isEmpty() || !path2.isEmpty()){
                 if(jk==0){
                     int size = path1.size();
                     List<Integer> path = new ArrayList<>();
                     for(int i=0;i<size;i++){
                         TreeNode pop = path1.pop();
                         path.add(pop.val);
                         if(pop.left!=null){
                             path2.offer(pop.left);
                         }
                         if(pop.right!=null){
                             path2.offer(pop.right);
                         }
                     }
                 }else {
                     int size = path2.size();
                     List<Integer> path = new ArrayList<>();
                     for(int i=0;i<size;i++){
                         TreeNode poll = path2.poll();
                         path.add(poll.val);
                         if(poll.left!=null){
                             path1.push(poll.left);
                         }
                         if(poll.right!=null){
                             path1.push(poll.right);
                         }
                     }
                 }

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
