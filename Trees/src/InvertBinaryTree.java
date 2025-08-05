public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode node = new TreeNode(root.val);
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        node.left = right;
        node.right=left;
        return node;
    }
}
