public class Mianshi0404 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(treeHeight(root.left) - treeHeight(root.right)) <= 1;
    }

    int treeHeight(TreeNode root){
        if (root == null) return 0;
        return Math.max(treeHeight(root.left), treeHeight(root.right)) + 1;
    }
}
