package BinaryTrees.EasyProblems;

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class perfectTree {
    public static int getDepth(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    public static boolean isPerfectTree(Node root, int depth) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return depth == 1;

        if (root.left == null || root.right == null)
            return false;

        return isPerfectTree(root.left, depth - 1) && isPerfectTree(root.right, depth - 1);
    }

    public static boolean isPerfect(Node root) {
        int depth = getDepth(root);
        return isPerfectTree(root, depth);
    }

    public static void main(String[] args) {
        // Binary tree
        // 10
        // / \
        // 20 30
        // / \ / \
        // 40 50 60 70
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        if (isPerfect(root)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
