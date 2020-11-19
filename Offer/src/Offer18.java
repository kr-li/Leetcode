public class Offer18 {
    public static void main(String[] args) {

    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode item = new ListNode(0);
        ListNode dummy = item;
        item.next = head;
        while (item.next.val != val){
            item = item.next;
        }
        item.next = item.next.next;
        return dummy.next;
    }
}
