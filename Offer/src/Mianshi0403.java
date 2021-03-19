import java.util.*;

public class Mianshi0403 {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) return new ListNode[0];
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<ListNode> listNodes = new ArrayList<>();
        queue.add(tree);

        while (!queue.isEmpty()){
            int size = queue.size();
            ListNode dummy = new ListNode(-1);
            ListNode head = dummy;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                ListNode listNode = new ListNode(treeNode.val);
                dummy.next = listNode;
                dummy = listNode;
                if (treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
            listNodes.add(head.next);
        }
        ListNode[] ans = new ListNode[listNodes.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = listNodes.get(i);
        }
        return ans;
    }
}
