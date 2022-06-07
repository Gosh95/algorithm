package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class IronRod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr =  br.readLine().split("");
        Stack<String> stack = new Stack<>();
        int idx = 0;
        int answer = 0;

        while (idx != arr.length) {
            if (arr[idx].equals("(") && arr[idx + 1].equals(")")) {
                answer += stack.size();
                idx += 2;

                continue;
            }

            if (arr[idx].equals("(")) {
                stack.push(arr[idx]);
                answer++;
            } else  if (!stack.isEmpty() && arr[idx].equals(")")) {
                stack.pop();
            }

            idx++;
        }

        System.out.println(answer);
    }
}
