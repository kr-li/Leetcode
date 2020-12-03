public class Offer28 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return help(root.left, root.right);
    }

    private boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return help(left.left, right.right) && help(left.right, right.left);
    }
}
