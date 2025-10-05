// Java Program to insert a node at the beginning of a
// doubly linked list

class Node {
    int data;
    Node next, prev;

    Node(int newData) {
        data = newData;
        next = prev = null;
    }
}

public class insertion {

    // Function to insert a new node at the front of
    // doubly linked list
    public static Node insertAtFront(Node head, int newData) {

        // Create a new node
        Node newNode = new Node(newData);

        // Make next of new node as head
        newNode.next = head;

        // Change prev of head node to new node
        if (head != null) {
            head.prev = newNode;
        }

        // Return the new node as the head of the doubly
        // linked list
        return newNode;
    }

    public static Node insertEnd(Node head, int newData) {

        // Create a new node
        Node newNode = new Node(newData);

        // If the linked list is empty, set the new node as
        // the head
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            // Set the next of last node to the new node
            curr.next = newNode;

            // Set the prev of new node to the last node
            newNode.prev = curr;
        }

        return head;
    }

    public static Node insertAtPosition(Node head, int pos, int new_data) {
        // Create a new node
        Node new_node = new Node(new_data);

        // Insertion at the beginning
        if (pos == 1) {
            new_node.next = head;

            // If the linked list is not empty, set the prev of head to new node
            if (head != null) {
                head.prev = new_node;
            }

            // Set the new node as the head of linked list
            head = new_node;
            return head;
        }

        Node curr = head;

        // Traverse the list to find the node before the insertion point
        for (int i = 1; i < pos - 1 && curr != null; ++i) {
            curr = curr.next;
        }

        // If the position is out of bounds
        if (curr == null) {
            System.out.println("Position is out of bounds.");
            return head;
        }

        // Set the prev of new node to curr
        new_node.prev = curr;

        // Set the next of new node to next of curr
        new_node.next = curr.next;

        // Update the next of current node to new node
        curr.next = new_node;

        // If the new node is not the last node, update prev of next node to new node
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }

        // Return the head of the doubly linked list
        return head;
    }

    // Function to print the doubly linked list
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
        // 2 <-> 3 <-> 4 -> NULL
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;

        // Print the original list
        System.out.println("Original Linked List: ");
        printList(head);

        // Insert a new node at the front of the list
        System.out.println(
                "After inserting Node at the front: ");
        int data = 1;
        head = insertAtFront(head, data);

        // Print the updated list
        printList(head);
    }
}