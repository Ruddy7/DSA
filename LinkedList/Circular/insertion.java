class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class insertion {

    static Node insertAtBeginning(Node last, int data) {
        Node newNode = new Node(data);
        if (last == null) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = last.next;
        last.next = newNode;

        return last;
    }

    static Node insertEnd(Node tail, int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            // If the list is empty, initialize it with the
            // new node
            tail = newNode;
            newNode.next = newNode;
        } else {
            // Insert new node after the current tail and
            // update the tail pointer
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        return tail;
    }

    public static Node insertAtPosition(Node last, int data, int pos) {
        if (last == null) {
            // If the list is empty
            if (pos != 1) {
                System.out.println("Invalid position!");
                return last;
            }
            // Create a new node and make it point to itself
            Node newNode = new Node(data);
            last = newNode;
            last.next = last;
            return last;
        }

        // Create a new node with the given data
        Node newNode = new Node(data);

        // curr will point to head initially
        Node curr = last.next;

        if (pos == 1) {
            // Insert at the beginning
            newNode.next = curr;
            last.next = newNode;
            return last;
        }

        // Traverse the list to find the insertion point
        for (int i = 1; i < pos - 1; ++i) {
            curr = curr.next;
            // If position is out of bounds (beyond the circular linked list)
            if (curr == last) {
                System.out.println("Invalid position!");
                return last;
            }
        }
        // Insert the new node at the desired position
        newNode.next = curr.next;
        curr.next = newNode;

        // Update last if the new node is inserted at the end
        if (curr == last) {
            last = newNode;
        }

        return last;
    }

    static void printList(Node last) { // works with do while only
        Node head = last.next;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node last = head.next.next;
        last.next = head;

        // last = insertAtBeginning(last, 5);
        // printList(last);

        // System.out.print("Original list: ");
        // printList(last);

        // last = insertEnd(last, 5);
        // last = insertEnd(last, 6);

        // System.out.print("List after inserting 5 and 6: ");
        // printList(last);
    }
}