public class Offer35 {

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node cur = head;
        while (cur != null){
            Node temp = new Node(cur.val);
            temp.next = cur.next;
            cur.next = cur;
            cur = temp.next;
        }

        cur = head;
        while (cur != null){
            if (cur.random != null){
                cur.next.random = cur.random.next;
            }
        }

        cur = head.next;
        Node pre = head, res = head.next;
        while (cur.next != null){
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }

        pre.next = null;
        return res;
    }
}
