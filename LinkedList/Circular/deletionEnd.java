class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class deletionEnd {
    public static Node deleteLastNode(Node last) {
        if (last == null) {
            return null;
        }
        Node head = last.next;

        // If there is only one node in the list
        if (head == last) {
            last = null;
            return last;
        }
        // Traverse the list to find the second last node
        Node curr = head;
        while (curr.next != last) {
            curr = curr.next;
        }
        // Update the second last node's next pointer to
        // point to head
        curr.next = head;
        last = curr;

        return last;
    }

    public static void printList(Node last) {
        if (last == null)
            return;

        Node head = last.next;
        while (true) {
            System.out.print(head.data);
            head = head.next;
            if (head == last.next)
                break;
            System.out.print(" <-> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(3);
        first.next.next = new Node(4);

        Node last = first.next.next;
        last.next = first;

        last = deleteLastNode(last);
        printList(last);
    }
}