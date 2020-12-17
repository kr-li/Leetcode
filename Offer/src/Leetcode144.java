import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode144 {

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        help(root, ans);
        return ans;
    }

    void help(TreeNode root, List<Integer> arr){
        if (root == null) return;
        arr.add(root.val);
        help(root.left, arr);
        help(root.right, arr);
    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            ans.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return ans;
    }
}
