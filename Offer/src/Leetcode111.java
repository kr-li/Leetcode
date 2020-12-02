import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 求一个二叉树最小深度
 */

public class Leetcode111 {
    public int minDepth(TreeNode root) {
        int ans = 1;
        if (root == null) return 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
                if (node.left == null && node.right == null){
                    return ans;
                }
            }
            ans ++;
        }
        return ans;
    }
}
