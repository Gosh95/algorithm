package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValueInParentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parentheses = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        int answer = 0;
        int tempNum = 1;

        for (int i = 0; i < parentheses.length; i++) {
            String p = parentheses[i];

            if (p.equals("(")) {
                stack.push(p);
                tempNum *= 2;
            }

            if (p.equals("[")) {
                stack.push(p);
                tempNum *= 3;
            }

            if (p.equals(")")) {
                if (stack.isEmpty() || stack.peek().equals("[")) {
                    answer = 0;
                    break;
                }

                if (parentheses[i - 1].equals("(")) {
                    answer += tempNum;
                }

                stack.pop();
                tempNum /= 2;
            }

            if (p.equals("]")) {
                if (stack.isEmpty() || stack.peek().equals("(")) {
                    answer = 0;
                    break;
                }

                if (parentheses[i - 1].equals("[")) {
                    answer += tempNum;
                }

                stack.pop();
                tempNum /= 3;
            }
        }

        if (stack.isEmpty()) {
            System.out.println(answer);
        } else {
            System.out.println(0);
        }
    }
}
