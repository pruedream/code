package letcoode100.二叉树;

/**
 * @author spike
 * @version 1.0.0
 */
public class 对称二叉树 {

    /**
     * 前序
     */
    boolean gh=true ;
    public boolean isSymmetric(TreeNode root) {
        kl(root.left,root.right);
        return gh;
    }

    public void kl(TreeNode left,TreeNode right){
        if(left == null && right == null){

            return  ;
        }
        if(left == null && right != null){
            gh = false;

            return  ;
        }
        if(left != null && right == null){
            gh = false;

            return  ;
        }
        if(left.val != right.val){
            gh = false;

            return ;
        }



        kl(left.left,right.right);
        kl(left.right,right.left);

        return ;
    }

    /**
     * 后序
     */

        public boolean isSymmetric1(TreeNode root) {
            return ok(root.left,root.right);
        }

        public boolean ok(TreeNode left,TreeNode right){
            if(left == null && right == null){
                return true;
            }
            if(left != null && right == null){
                return false;
            }
            if(left == null && right != null){
                return false;
            }
            if(right.val != left.val){
                return false;
            }

            boolean ok = ok(left.left, right.right);
            boolean ok1 = ok(left.right, right.left);
            return ok && ok1;

        }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
