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

public class level {
    static int getLevel(Node root, int target, int level) {
        if (root == null)
            return -1;

        if (root.data == target)
            return level;

        int leftLevel = getLevel(root.left, target, level + 1);
        if (leftLevel != -1)
            return leftLevel;

        return getLevel(root.right, target, level + 1);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree:
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 5;
        System.out.println(getLevel(root, target, 1));
    }
}
