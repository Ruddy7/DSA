package LinkedList.MediumProblems;

class Node {
    Node next;
    Node prev;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// program to find size of Doubly Linked List
public class sizeDoubly {
    static int findSize(Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println(findSize(head));
    }
}
