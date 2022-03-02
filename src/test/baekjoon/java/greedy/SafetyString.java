package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SafetyString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 1;
        StringBuilder sb = new StringBuilder();
        while(true) {
            int count = 0;
            String item = br.readLine();
            if(item.contains("-")) {
                break;
            }

            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < item.length(); i++) {
                if(item.charAt(i) == '{') {
                    stack.push('{');
                } else {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        count++;
                        stack.push('{');
                    }
                }
            }

            count += stack.size() / 2;
            sb.append(idx + ". " + count).append("\n");
            idx++;
        }

        System.out.println(sb);
    }
}