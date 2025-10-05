class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insertion {
    public static Node insertAtFront(Node head, int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        return newNode;
    }

    public static Node insertAtEnd(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null)
            return newNode;

        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = newNode;
        return head;
    }

    public static Node insertAtPos(Node head, int pos, int data) {
        if (pos < 1)
            return head;
        if (pos == 1) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        Node newNode = new Node(data);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        printList(head);
        Node front = insertAtFront(head, 1);
        printList(front);
        Node last = insertAtEnd(head, 5);
        printList(last);
        Node position = insertAtPos(head, 3, 6);
        printList(position);
    }
}