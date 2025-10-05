class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class deletion {
    public static Node deleteFirstNode(Node last) {
        if (last == null) {

            // If the list is empty
            System.out.println("List is empty");
            return null;
        }

        Node head = last.next;

        if (head == last) {

            // If there is only one node in the list
            last = null;
        } else {

            // More than one node in the list
            last.next = head.next;
        }

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

        last = deleteFirstNode(last);

        printList(last);
    }
}