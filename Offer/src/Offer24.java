public class Offer24 {

    public ListNode reverseList(ListNode head) {
        ListNode left = null;
        ListNode right = head;
        while (right != null){
            ListNode rightNext = right.next;
            right.next = left;
            left = right;
            right = rightNext;
        }
        return left;
    }
}
