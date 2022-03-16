package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class MakeBigger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = K;

        int[] nums = Arrays.stream(br.readLine().split("")).mapToInt(i -> Integer.parseInt(i)).toArray();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            while(count != 0 && !stack.isEmpty() && stack.peek() < nums[i]) {
                count--;
                stack.pop();
            }
            stack.push(nums[i]);
        }

        String answer = stack.subList(0, N - K).stream().map(i -> String.valueOf(i)).collect(Collectors.joining());
        System.out.println(answer);
    }
}
