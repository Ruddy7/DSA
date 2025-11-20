package Stacks.EasyProblems;

import java.util.Stack;

public class reverseStack {

    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> ans = new Stack<>();
        while (!st.isEmpty()) {
            ans.push(st.pop());
        }

        st.addAll(ans);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverseStack(st);

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
