package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Top {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tops = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            tops[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[N];
        for(int i = N - 1; i > -1; i--) {
            while(!stack.isEmpty() && tops[stack.peek()] < tops[i]) {
                answer[stack.pop()] = (i + 1);
            }

            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i : answer) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
