package Stacks.EasyProblems;

import java.util.Stack;

public class infixToPrefix {
    static int precedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    // function to check if operator is right-associative
    static boolean isRightAssociative(char c) {
        return c == '^';
    }

    // function to check if a character is an operator
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    static String inToPre(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c))
                res.append(c);
            else if (c == ')')
                st.push(c);
            else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')')
                    res.append(st.pop());
                if (!st.isEmpty())
                    st.pop();
            } else if (isOperator(c)) {
                while (!st.isEmpty() && isOperator(st.peek()) &&
                        (precedence(st.peek()) > precedence(c) ||
                                (precedence(st.peek()) == precedence(c) && isRightAssociative(c)))) {
                    res.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "a*(b+c)/d";
        System.out.println(inToPre(s));
    }
}
