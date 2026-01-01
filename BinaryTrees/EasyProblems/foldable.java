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

public class foldable {
    static void mirror(Node root) {
        if (root == null)
            return;

        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    static boolean isStructSame(Node left, Node right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;

        return isStructSame(left.left, right.left) && isStructSame(left.right, right.right);
    }

    static boolean isFoldable(Node root) {
        if (root == null)
            return true;

        mirror(root.left);

        boolean ans = isStructSame(root.left, root.right);

        mirror(root.left);

        return ans;
    }

    public static void main(String[] args) {
        // The constructed binary tree is
        // 1
        // / \
        // 2 3
        // \ /
        // 4 5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);

        if (isFoldable(root)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
