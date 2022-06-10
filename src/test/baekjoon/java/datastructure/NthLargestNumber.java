package test.baekjoon.java.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

import static java.util.Arrays.stream;

public class NthLargestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int[] nums = stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (!queue.isEmpty()) {
                for (int num : nums) {
                    if (queue.peek() < num) {
                        queue.poll();
                        queue.add(num);
                    }
                }
            } else {
                for (int num : nums) {
                    queue.add(num);
                }
            }
        }

        System.out.println(queue.peek());
    }
}
