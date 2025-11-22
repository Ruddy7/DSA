package Stacks.MediumProblems;

import java.util.ArrayList;
import java.util.Stack;

public class nextGreaterElement {
    static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++)
            res.add(-1);

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            res.set(i, st.isEmpty() ? -1 : st.peek());
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        ArrayList<Integer> res = nextLargerElement(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
