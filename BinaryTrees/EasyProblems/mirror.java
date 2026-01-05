package BinaryTrees.EasyProblems;

//Given two Binary Trees, the task is to check if two trees are mirror of each other or not
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class mirror {
    public static boolean areMirror(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        return (root1.data == root2.data) && areMirror(root1.left, root2.right)
                && areMirror(root1.right, root2.left);
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);

        if (areMirror(root1, root2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
