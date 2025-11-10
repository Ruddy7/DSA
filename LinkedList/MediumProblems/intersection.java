package LinkedList.MediumProblems;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class intersection {

    static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        Node revHead2 = reverse(head2);
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = revHead2;

        Node slow = head1;
        Node fast = head1;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head1;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // first list: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        // second list: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);

        // intersection at node with value 15
        head2.next.next.next = head1.next;

        Node interPt = intersectPoint(head1, head2);

        if (interPt == null)
            System.out.println("-1");
        else
            System.out.println(interPt.data);
    }
}
