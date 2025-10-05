class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class deletion {
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node deleteAtFront(Node head) {
        if (head == null)
            return null;
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    public static Node deleteAtLast(Node head) {
        if (head == null || head.next == null)
            return null;
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return head;
    }

    public static Node deleteAtPos(Node head, int position) {
        Node temp = head;
        Node prev = null;

        // Base case if linked list is empty
        if (temp == null)
            return head;

        // Case 1: Head is to be deleted
        if (position == 1) {
            head = temp.next;
            return head;
        }

        // Case 2: Node to be deleted is in middle
        // Traverse till given position
        for (int i = 1; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }

        // If given position is found, delete node
        if (temp != null) {
            prev.next = temp.next;
        } else {
            System.out.println("Data not present");
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        // Node front = deleteAtFront(head);
        // printList(front);
        // Node back = deleteAtLast(head);
        // printList(back);
        Node pos = deleteAtPos(head, 2);
        printList(pos);
    }
}