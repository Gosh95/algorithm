package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OkeunSoo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        List<Integer> nums = new ArrayList<>();
        int[] result = new int[N];
        Arrays.fill(result, -1);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && nums.get(stack.peek()) < nums.get(i)) {
                result[stack.pop()] = nums.get(i);
            }
            stack.add(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}
