import java.util.ArrayDeque;
import java.util.Queue;

public class Offer55first {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int ans = 0;
        while (!queue.isEmpty()){
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            ans++;
        }
        return ans;
    }

    private int secondMethod(TreeNode root){
        if (root == null) return 0;
        return Math.max(secondMethod(root.left), secondMethod(root.right)) + 1;
    }
}
