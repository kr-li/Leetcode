public class Leetcode101 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        boolean ans = help(root.left, root.right);
        return ans;
    }

    private boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return true;
        return help(left.left, right.right) && help(left.right, right.left);
    }
}
