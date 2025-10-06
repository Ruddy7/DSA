public class circularprint {

    static void printList(Node head) {
        if (head == null)
            return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    } // count of nodes in circular linked list same, just inside the do loop,
      // curr =curr.next and count++

    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(2);
        head.next.next = new Node(56);
        head.next.next.next = new Node(12);

        head.next.next.next.next = head;

        printList(head);
    }
}
