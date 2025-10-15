package LinkedList.MediumProblems;

// sum of 2 linked list into third Linked List

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sum {
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static Node sumTwo(Node head1, Node head2) {
        return head1;
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        Node head2 = new Node(9);
        head2.next = new Node(9);
        head2.next.next = new Node(9);
        Node ans = sumTwo(head1, head2);
        printList(head1);
        printList(head2);
        printList(ans);
    }
}
