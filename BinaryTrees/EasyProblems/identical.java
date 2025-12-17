package BinaryTrees.EasyProblems;

//check if two binary trees are identical
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class identical {
    public static boolean areIdentical(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        return (root1.data == root2.data) && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        if (areIdentical(root1, root2))
            System.out.println("The trees are identical");
        else
            System.out.println("The trees are not identical");
    }
}
