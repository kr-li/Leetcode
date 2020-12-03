public class Offer27 {

    /**
     * 镜像二叉树
     * @param root
     * @return
     */

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        mirror(root);
        return root;
    }

    private void mirror(TreeNode root) {
        if (root == null) return;

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;

        mirror(root.left);
        mirror(root.right);
    }
}
