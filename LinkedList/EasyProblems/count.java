public class count {

    static int countNodes(Node head, int key) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.data == key) {
                count++;
            }
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(6);
        int key = 1;
        System.out.println("Count: " + countNodes(head, key));
    }
}
