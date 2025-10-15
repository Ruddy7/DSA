package LinkedList.MediumProblems;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class checkIfDescending {
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static boolean check(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data < curr.next.data)
                return false;
            curr = curr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(8);
        head.next = new Node(7);
        head.next.next = new Node(5);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(1);
        printList(head);
        boolean result = check(head);
        System.out.println(result);
    }
}
