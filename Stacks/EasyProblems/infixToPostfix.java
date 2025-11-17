package Stacks.EasyProblems;

import java.util.Stack;

public class infixToPostfix {

    static int Prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    public static String inToPost(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if operand, add to result
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                res.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop();
            } else {
                while (!st.isEmpty() && Prec(c) <= Prec(st.peek())) {
                    res.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String exp = "a*(b+c)/d";
        System.out.println(inToPost(exp));
    }
}
