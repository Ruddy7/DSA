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

public class insertion {
    public static Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.left == null) {
                curr.left = new Node(key);
                return root;
            } else {
                q.add(curr.left);
            }

            if (curr.right == null) {
                curr.right = new Node(key);
                return root;
            } else {
                q.add(curr.right);
            }
        }
        return root;
    }

    public static void inorder(Node curr) {
        if (curr == null)
            return;
        inorder(curr.left);
        System.out.print(curr.data + " ");
        inorder(curr.right);
    }

    public static void main(String[] args) {
        // Constructing the binary tree
        // 10
        // / \
        // 11 9
        // / / \
        // 7 15 8
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        int key = 12;
        root = insertNode(root, key);

        inorder(root);
    }
}
