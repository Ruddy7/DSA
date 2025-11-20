package Stacks.EasyProblems;

import java.util.Stack;

public class evaluatePostfix {
    public static int evaluatePostfix(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (String s : arr) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^")) {
                int val1 = st.pop();
                int val2 = st.pop();
                int res = 0;

                switch (s) {
                    case "+":
                        res = val2 + val1;
                        break;

                    case "-":
                        res = val2 - val1;
                        break;

                    case "*":
                        res = val2 * val1;
                        break;

                    case "/":
                        res = (int) Math.floor(val2 / val1);
                        break;

                    case "^":
                        res = (int) Math.pow(val2, val1);
                        break;

                    default:
                        break;
                }
                st.push(res);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String[] arr = { "2", "3", "1", "*", "+", "9", "-" };
        System.out.println(evaluatePostfix(arr));
    }
}
