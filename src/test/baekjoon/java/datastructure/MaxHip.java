package test.baekjoon.java.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaxHip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            queue.add(num);

            if (num == 0) {
                answer.add(queue.poll());
            }
        }

        for (int a : answer) {
            System.out.println(a);
        }
    }
}
