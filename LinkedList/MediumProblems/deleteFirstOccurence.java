package LinkedList.MediumProblems;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class deleteFirstOccurence {
    static Node delOccurence(Node head, int key) {
        if (head == null)
            return null;

        if (head.data == key)
            return head.next;

        Node curr = head;
        Node prev = null;

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        printList(head);
        int key = 2;
        head = delOccurence(head, key);
        printList(head);
    }
}