import java.util.List;

public class Leetcode109 {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return help(head);
    }

    private TreeNode help(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }

        pre.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = help(head);
        root.right = help(slow.next);
        return root;
    }
}
