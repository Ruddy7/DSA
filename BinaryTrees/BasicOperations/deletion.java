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

public class deletion {
    static void deleteDeepest(Node root, Node delNode) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node curr;
        while (!q.isEmpty()) {
            curr = q.poll();

            if (curr == delNode) {
                curr = null;
                delNode = null;
                return;
            }

            if (curr.right != null) {
                if (curr.right == delNode) {
                    curr.right = null;
                    delNode = null;
                    return;
                }
                q.add(curr.right);
            }

            if (curr.left != null) {
                if (curr.left == delNode) {
                    curr.left = null;
                    delNode = null;
                    return;
                }
                q.add(curr.left);
            }
        }
    }

    static Node deletionNode(Node root, int key) {
        if (root == null)
            return null;

        if (root.left == null && root.right == null) {
            if (root.data == key)
                return null;
            else
                return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node curr = null, keyNode = null;

        while (!q.isEmpty()) {
            curr = q.poll();

            if (curr.data == key)
                keyNode = curr;

            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }

        if (keyNode != null) {
            int x = curr.data;
            keyNode.data = x;
            deleteDeepest(root, curr);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // Construct the binary tree
        // 10
        // / \
        // 11 9
        // / \ / \
        // 7 12 15 8
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        int key = 11;
        root = deletionNode(root, key);
        inorder(root);
    }
}
