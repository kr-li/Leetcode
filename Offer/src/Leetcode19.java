public class Leetcode19 {
    /**
     * 注意头节点
     * 设置一个dummy标识位
     * @param head
     * @param n
     * @return
     */

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right != null){
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }
}
