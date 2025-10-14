package LinkedList.MediumProblems;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// For singly Linked List

public class palindrome {
    static Node reverse(Node head) {
        Node curr = head;
        Node next;
        Node prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static boolean isIdentical(Node n1, Node n2) {
        while (n1 != null && n2 != null) {
            if (n1.data != n2.data)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Using this we found the middle of the Linked List, now we will reverse this
        // second half of Linked List keeping this middle as head
        Node head2 = reverse(slow.next);
        slow.next = null; // This is done to break the Linked List into two halves

        // Now we will check if the data matches, if they do they are palindrome
        boolean res = isIdentical(head, head2);

        // head2 = reverse(head2); Reversing the second half again to restore the
        // original Linked List (Optional)
        // slow.next = head2; Joining the two halves again

        return res;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        boolean result = checkPalindrome(head);
        if (result)
            System.out.println("Palindrome Singly Linked List");
        else
            System.out.println("Not a Palindrome Singly Linked List");
    }
}
