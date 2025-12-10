package BinaryTrees.BasicOperations;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class order {

    // inorder -> left child, then root node and then right child
    static void inOrder(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;

        inOrder(root.left, res);
        res.add(root.data);
        inOrder(root.right, res);
    }

    // preorder -> root, then left child and then right child
    static void preOrder(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;

        res.add(root.data);
        preOrder(root.left, res);
        preOrder(root.right, res);
    }

    // postorder -> first left child, then right child and then root.
    static void postOrder(Node root, ArrayList<Integer> res) {
        if (root == null)
            return;
        postOrder(root.left, res);
        postOrder(root.right, res);
        res.add(root.data);
    }

    public static void main(String[] args) {
        // Create binary tree
        // 1
        // / \
        // 2 3
        // / \ \
        // 4 5 6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        ArrayList<Integer> res = new ArrayList<>();
        // inOrder(root, res);
        // preOrder(root, res);
        postOrder(root, res);

        for (int node : res)
            System.out.print(node + " ");
    }
}
