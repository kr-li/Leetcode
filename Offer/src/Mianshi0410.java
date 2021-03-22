public class Mianshi0410 {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if (t2 == null) return true;
        if (t1 == null) return false;
        return help(t1, t2) || checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
    }

    private boolean help(TreeNode t1, TreeNode t2) {
        if (t1 == t2) return true;
        if (t1 == null || t2 == null) return false;
        return t1.val == t2.val && help(t1.left, t2.left) && help(t1.right, t2.right);
    }
}
