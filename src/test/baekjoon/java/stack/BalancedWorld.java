package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String sentence = br.readLine();
            if(sentence.equals(".")) {
                break;
            }

            if(checkBracket(sentence)) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            };
        }

        System.out.println(sb);
    }

    private static boolean checkBracket(String sentence) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < sentence.length(); i++) {
            String s = String.valueOf(sentence.charAt(i));
            if(s.equals("(") || s.equals("[")) {
                stack.push(s);
            }

            if(s.equals(")")) {
                if(!stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if(s.equals("]")) {
                if(!stack.isEmpty() && stack.peek().equals("[")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty() ? true : false;
    }
}
