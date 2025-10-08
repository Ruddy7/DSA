public class singlytocircular {

    static Node circular(Node head) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return head;
    }

    static void printList(Node head) {
        Node curr = head;

        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(16);

        head = circular(head);

        printList(head);
    }
}
