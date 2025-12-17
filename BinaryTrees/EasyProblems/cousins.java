package BinaryTrees.EasyProblems;
//Given a binary tree (having distinct node values) root and two node values. The task is to check whether the two nodes with values a and b are cousins.

//Note: Two nodes of a binary tree are cousins if they have the same depth with different parents.

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class cousins {
    static int depthA = -1, depthB = -1;
    static Node parentA = null, parentB = null;

    public static boolean isCousins(Node root, int a, int b) {
        // reset (important if method called multiple times)
        depthA = depthB = -1;
        parentA = parentB = null;

        dfs(root, null, a, b, 0);
        return depthA == depthB && parentA != parentB;
    }

    static void dfs(Node root, Node parent, int a, int b, int depth) {
        if (root == null)
            return;

        if (root.data == a) {
            depthA = depth;
            parentA = parent;
        }

        if (root.data == b) {
            depthB = depth;
            parentB = parent;
        }

        dfs(root.left, root, a, b, depth + 1);
        dfs(root.right, root, a, b, depth + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        int a = 4, b = 5;

        if (isCousins(root, a, b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
