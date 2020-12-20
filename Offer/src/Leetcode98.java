import java.util.Stack;

public class Leetcode98 {

    /**
     * 运用中序遍历
     * 设置一个pre
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double num = -Double.MAX_VALUE;
        if (root == null) return true;
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= num){
                return false;
            }
            num = root.val;
            root = root.right;
        }
        return true;
    }
}
