import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        help(root, ans);
        return ans;
    }

    void help(TreeNode root, List<Integer> arr){
        if (root == null) return;

        help(root.left, arr);
        arr.add(root.val);
        help(root.right, arr);
    }

    public List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}
