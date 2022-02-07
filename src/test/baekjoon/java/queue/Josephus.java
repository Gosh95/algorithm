package test.baekjoon.java.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Josephus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        Deque<Integer> queue = new LinkedList<>();

        for(int i = 1; i < N + 1; i++) {
            queue.add(i);
        }

        sb.append("<");
        for(int i = 0; i < N; i++) {
            int count = 1;
            while(count != K) {
                queue.add(queue.poll());
                count++;
            }
            if(i == N - 1) {
                sb.append(queue.poll()).append(">");
            } else {
                sb.append(queue.poll()).append(", ");
            }
        }

        System.out.println(sb);
    }
}
