import java.util.ArrayList;
import java.util.List;

public class Leetcode145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        help(root, ans);
        return ans;
    }

    private void help(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        help(root.left, ans);
        help(root.right, ans);
        ans.add(root.val);
    }
}
