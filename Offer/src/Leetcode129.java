import java.util.*;

/**
 * 每条枝叶数字之和
 *
 * 深度优先搜索
 * 递归，左子树和右子树
 *
 * 广度优先搜索：维护两个队列，依此取出元素
 */

public class Leetcode129 {

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int i) {
        if (root == null) return 0;
        int sum = 10 * i + root.val;
        if (root.left == null && root.right == null){
            return sum;
        }
        else{
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }

    public int sumNumbers2(TreeNode root) {
        int ans = 0;
        if (root == null) return ans;

        Queue<TreeNode> treeNodeQueue = new ArrayDeque<>();
        Queue<Integer> integerQueue = new ArrayDeque<>();

        treeNodeQueue.add(root);
        integerQueue.add(root.val);

        while (!treeNodeQueue.isEmpty()){
            TreeNode node = treeNodeQueue.poll();
            int val = integerQueue.poll();
            if (node.left == null && node.right == null){
                ans += val;
            }

            if (node.left != null){
                treeNodeQueue.add(node.left);
                integerQueue.add(node.left.val + val * 10);
            }

            if (node.right != null){
                treeNodeQueue.add(node.right);
                integerQueue.add(node.right.val + val * 10);
            }
        }
        return ans;
    }


}
