package test.baekjoon.java.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class CardV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        int num = 1;
        for(int i = 1; i < N + 1; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            queue.pop();
            queue.add(queue.poll());
        }

        System.out.println(queue.getFirst());
    }
}
