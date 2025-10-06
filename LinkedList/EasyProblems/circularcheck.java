public class circularcheck {
    static boolean isCircular(Node head) {
        if (head == null)
            return true;
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        System.out.println(isCircular(head));
        head.next.next.next.next = head;
        System.out.println(isCircular(head));
    }
}
