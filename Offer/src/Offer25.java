public class Offer25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode mergedHead;
        if (l1.val < l2.val){
            mergedHead = l1;
            mergedHead.next = mergeTwoLists(l1.next, l2);
        }
        else {
            mergedHead = l2;
            mergedHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergedHead;
    }
}
