import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null || A == null) {
            return false;
        }

        return doesTree1HasTree2(A, B) || doesTree1HasTree2(A.left, B) || doesTree1HasTree2(A.right, B);
    }

    static boolean doesTree1HasTree2(TreeNode A, TreeNode B){
        if (B == null) return true;

        if (A == null || A.val != B.val) return false;

        return doesTree1HasTree2(A.left, B.left) && doesTree1HasTree2(A.right, B.right);
    }
}
