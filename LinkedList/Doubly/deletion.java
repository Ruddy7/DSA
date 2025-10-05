// Java Program to delete a node from the 
// beginning of Doubly Linked List

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class deletion {

    // Function to delete the first node (head) of the
    // list and return the second node as the new head
    public static Node delHead(Node head) {

        // If empty, return null
        if (head == null) {
            return null;
        }

        // Store in temp for deletion later
        Node temp = head;

        // Move head to the next node
        head = head.next;

        // Set prev of the new head
        if (head != null) {
            head.prev = null;
        }

        // Return new head
        return head;
    }

    public static Node delLast(Node head) {

        // Corner cases
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        // Traverse to the last node
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        // Update the previous node's next pointer
        if (curr.prev != null) {
            curr.prev.next = null;
        }

        // Return the updated head
        return head;
    }

    public static Node delPos(Node head, int x) {

        if (head == null) {
            return head;
        }

        Node curr = head;

        // traverse to the node at the given position
        for (int i = 1; curr != null && i < x; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            // position exceeds list length, no deletion
            return head;
        }

        // if the node to delete is not the first node
        // update previous node's next
        if (curr.prev != null)
            curr.prev.next = curr.next;

        // if the node to delete is not the last node
        // update next node's prev
        if (curr.next != null)
            curr.next.prev = curr.prev;

        // if deleting the head, move head pointer to next node
        if (head == curr)
            head = curr.next;

        curr = null;
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

        // Create a hardcoded doubly linked list:
        // 1 <-> 2 <-> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        System.out.print("Original Linked List: ");
        printList(head);

        System.out.print("After Deletion at the beginning: ");
        head = delHead(head);

        printList(head);
    }
}