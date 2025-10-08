//Exchange first and last nodes in Circular Linked List
public class exchange {

    static Node exchange(Node head) {
        if (head == null || head.next == head)
            return head;
        Node curr = head;
        Node prev = null;

        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        } // curr is now the last node
        int temp = head.data;
        head.data = curr.data;
        curr.data = temp;
        return head;
    }

    static void printList(Node head) {
        if (head == null)
            return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head;
        printList(head);
        head = exchange(head);
        printList(head);
    }
}