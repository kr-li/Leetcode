import java.util.*;

public class Leetcode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null){
            queue.add(root);
        }
        int step = 0;
        while (!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            if ((step & 1) == 0){
                Collections.reverse(level);//调用反转链表函数
            }
            step++;
            ans.add(level);
        }
        return ans;

    }
}
