package LinkedList.MediumProblems;

//This problem is not same as circular check. In circular check, we check if it is a Circular Linked List,
//but in this we check if there is a loop in a Singly Linked List (intentionally or by mistake).
//The loop could be anywhere in between the nodes as well.

//The key differences in code of both these questions are:
// in circular check fast starts at head.next and then we instantly check if slow == fast, whereas,
// In this code (Floyd algorithm), both start at head and then move forward via slow fast approach to check.

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class detectCycle {
    static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

        head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");

    }
}