package LinkedList.MediumProblems;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class firstNodeCircular {

    static Node findFirstNodeInCircularList(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Making the list circular

        Node result = findFirstNodeInCircularList(head);
        if (result != null) {
            System.out.println("First node in circular linked list: " + result.data);
        } else {
            System.out.println("The linked list is not circular.");
        }
    }
}
