package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CardFusionGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> queue = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            queue.offer(Long.parseLong(st.nextToken()));
        }

        while(m-- > 0) {
            long x = queue.poll();
            long y = queue.poll();
            long sum = x + y;
            queue.offer(sum);
            queue.offer(sum);
        }

        System.out.println(queue.stream().mapToLong(i -> i).sum());
    }
}