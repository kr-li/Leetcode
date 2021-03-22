public class Mianshi0406 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) return null;
        if (root.val <= p.val){
            TreeNode right = inorderSuccessor(root.right, p);
            return right;
        }
        else {
            TreeNode left = inorderSuccessor(root.left, p);
            return left == null ? root : left;
        }
    }
}
