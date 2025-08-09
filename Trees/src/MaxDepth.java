public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return depth(0,root);
    }
    public int depth(int k, TreeNode node) {
        if(node==null) {
            return k;
        }
        int l = depth(k+1, node.left);
        int r = depth(k+1, node.right);
        return Math.max(r,l);
    }
}
