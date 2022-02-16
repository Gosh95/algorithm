package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class CardSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> queue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            long num = (long)Integer.parseInt(br.readLine());
            queue.offer(num);
        }

        long result = 0;
        while(queue.size() > 1) {
            long a = queue.poll();
            long b = queue.poll();
            result += (a + b);
            queue.offer(a + b);
        }

        System.out.println(result);
    }
}

