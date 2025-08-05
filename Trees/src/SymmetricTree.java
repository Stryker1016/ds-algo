public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }
    public boolean symmetric(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null && right!=null){
            return false;
        }
        if(left!=null && right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }
        return symmetric(left.left,right.right) && symmetric(left.right,right.left);
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
