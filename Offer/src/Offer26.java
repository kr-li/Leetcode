
public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }

        return doesTree1HasTree2(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean doesTree1HasTree2(TreeNode A, TreeNode B){
        if (B == null) return true;

        if (A == null || A.val != B.val) return false;

        return doesTree1HasTree2(A.left, B.left) && doesTree1HasTree2(A.right, B.right);
    }
}
