package Stacks.MediumProblems;

import java.util.Stack;

public class removeBrackets {
    public static String simplify(String s) {
        int len = s.length();
        StringBuilder res = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        st.push(1);
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {

                // If the previous character is '-', we
                // flip the sign inside parentheses
                if (i > 0 && s.charAt(i - 1) == '-') {
                    st.push(-st.peek());
                } else {
                    st.push(st.peek());
                }
            } else if (s.charAt(i) == ')') {

                // Pop when we encounter a closing parenthesis
                st.pop();
            } else if (s.charAt(i) == '+') {

                // Add '+' or '-' based on the current sign
                if (st.peek() == 1)
                    res.append('+');
                else
                    res.append('-');
            } else if (s.charAt(i) == '-') {

                // Add '+' or '-' based on the current sign
                if (st.peek() == 1)
                    res.append('-');
                else
                    res.append('+');
            } else {

                // If it's an operand (variable), add it directly
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "(a-(d-(b-c))+d)";
        System.out.println(simplify(s));
    }
}
