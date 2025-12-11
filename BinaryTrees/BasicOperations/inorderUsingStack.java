package BinaryTrees.BasicOperations;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int var1) {
        this.data = var1;
        this.left = this.right = null;
    }
}

public class inorderUsingStack {

    static ArrayList<Integer> inOrder(Node root) {
        Stack<Node> s = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;

        while (curr != null || !s.isEmpty()) {
            // Reach the left most Node of the curr Node
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            // Current must be NULL at this point
            curr = s.pop();
            ans.add(curr.data);
            // we have visited the node and its left subtree. Now, it's right subtree's turn
            curr = curr.right;
        }
        return ans;
    }

    static void printList(ArrayList<Integer> res) {
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Constructed binary tree is
        // 1
        // / \
        // 2 3
        // / \
        // 4 5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> res = inOrder(root);
        printList(res);
    }
}
