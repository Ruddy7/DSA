package BinaryTrees.BasicOperations;

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class postorderUsingStack {
    public static ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        while (true) {
            while (root != null) {
                st.push(root);
                st.push(root);
                root = root.left;
            }

            if (st.isEmpty())
                return ans;
            root = st.pop();
            if (!st.isEmpty() && st.peek() == root) {
                root = root.right;
            } else {
                ans.add(root.data);
                root = null;
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> ans = postOrder(root);

        for (int val : ans) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
