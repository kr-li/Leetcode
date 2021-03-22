import java.util.Stack;

public class Mianshi0405 {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int pre = Integer.MAX_VALUE;
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val >= pre) return false;
            pre = root.val;
            root = root.right;
        }
        return true;
    }
}
