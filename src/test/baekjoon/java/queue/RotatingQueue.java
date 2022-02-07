package test.baekjoon.java.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class RotatingQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int count = 0;

        LinkedList<Integer> deque = new LinkedList<>();
        for(int i = 1; i < N + 1; i++) {
            deque.add(i);
        }

        String[] nums = br.readLine().split(" ");
        for(int i = 0; i < M; i++) {
            int index = 0;
            int halfIndex = 0;
            int pickNum = Integer.parseInt(nums[i]);
            if(deque.peekFirst() == pickNum) {
                deque.pollFirst();
                continue;
            }

            index = deque.indexOf(pickNum);

            if(deque.size() % 2 == 0) {
                halfIndex = deque.size() / 2 - 1;
            } else {
                halfIndex = deque.size() / 2;
            }

            if(index > halfIndex) {
                while(deque.peekFirst() != pickNum) {
                    count++;
                    deque.addFirst(deque.pollLast());
                }
            } else {
                while(deque.peekFirst() != pickNum) {
                    count++;
                    deque.addLast(deque.pollFirst());
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
