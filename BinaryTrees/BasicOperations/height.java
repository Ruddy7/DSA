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

public class height {
    // Recursive Method
    // public static int heightTree(Node root) {
    // if (root == null)
    // return -1;

    // int lHeight = heightTree(root.left);
    // int rHeight = heightTree(root.right);

    // return Math.max(lHeight, rHeight) + 1;
    // }

    // Level Order Traversal
    public static int heightTree(Node root) {
        if (root == null)
            return -1;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 0;

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            depth++;
        }
        return depth - 1;
    }

    public static void main(String[] args) {
        // Representation of the input tree:
        // 12
        // / \
        // 8 18
        // / \
        // 5 11
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(heightTree(root));
    }
}
