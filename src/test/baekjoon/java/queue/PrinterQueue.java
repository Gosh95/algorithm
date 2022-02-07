package test.baekjoon.java.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        Deque<Integer> priority;
        Deque<Integer> index;

        for(int i = 0; i < K; i++) {
            String[] first = br.readLine().split(" ");
            int N = Integer.parseInt(first[0]);
            int M = Integer.parseInt(first[1]);
            int rank = 1;
            priority = new LinkedList<>();
            List<Integer> tempPriority = new ArrayList<>();
            String[] priorities = br.readLine().split(" ");
            for(int k = 0; k < N; k++) {
                priority.add(Integer.parseInt(priorities[k]));
                tempPriority.add(Integer.parseInt(priorities[k]));
            }

            Collections.sort(tempPriority, Collections.reverseOrder());

            if(N == 1) {
                sb.append(1).append("\n");
                continue;
            }

            index = new LinkedList<>();
            for(int j = 0; j < N; j++) {
                index.add(j);
            }

            while(true) {
                if(priority.peek() != tempPriority.get(0)) {
                    priority.add(priority.poll());
                    index.add(index.poll());
                } else {
                    if(index.getFirst() != M) {
                        rank++;
                        priority.pop();
                        index.pop();
                        tempPriority.remove(0);
                    } else {
                        sb.append(rank).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}
