class Node {
    int data;
    Node next;
    Node prev;

    public Node(int d) {
        data = d;
        next = prev = null;
    }
}

class traversal {
    public static void forward(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void backward(Node tail) {
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Node head = new Node(10);
        // head.next = new Node(20);
        // head.next.prev = head;
        // head.next.next = new Node(30);
        // head.next.next.prev = head.next;
        // head.next.next.next = new Node(40);
        // head.next.next.next.prev = head.next.next;

        // Node temp = head;
        // while (temp != null) {
        // System.out.print(temp.data + "<->");
        // temp = temp.next;
        // }

        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        forward(head);
        backward(third);

    }
}