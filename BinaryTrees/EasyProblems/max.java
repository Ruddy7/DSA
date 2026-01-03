package BinaryTrees.EasyProblems;

//Finding max element in a tree
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class max {
    public static int findMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int ans = root.data;
        int leftans = findMax(root.left);
        int rightans = findMax(root.right);

        if (leftans > ans)
            ans = leftans;
        if (rightans > ans)
            ans = rightans;

        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.left.right = new Node(11);

        System.out.println(findMax(root));
    }
}
