public class Offer36 {

    /**
     * 设置两个pre 和 head 标志， 用中序遍历
     */
    DoubleNode pre;
    DoubleNode head;

    public DoubleNode treeToDoublyList(DoubleNode root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(DoubleNode cur) {
        if (cur == null) return;
        dfs(cur.left);
        if (pre == null){
            head = cur;
        }
        else {
            pre.right = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }
}
