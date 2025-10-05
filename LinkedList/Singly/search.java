class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class search {
    public static boolean searchKey(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public static boolean searchKeyRecursive(Node head, int key) {
        if (head == null)
            return false;
        if (head.data == key)
            return true;
        return searchKeyRecursive(head.next, key);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        boolean ans = searchKeyRecursive(head, 25);
        System.out.println(ans);
    }
}