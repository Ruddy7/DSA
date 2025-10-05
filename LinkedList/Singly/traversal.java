class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class traversal {
    public static void traverseList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void traverseListRecursive(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        traverseListRecursive(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverseListRecursive(head);
    }
}