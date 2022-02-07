package test.baekjoon.java.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class QueueV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            String command = br.readLine();
            if(command.contains("push")) {
                queue.add(Integer.parseInt(command.split(" ")[1]));
            } else if(command.equals("pop")) {
                if(!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if(command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if(command.equals("empty")) {
                if(queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if(command.equals("front")) {
                Integer item = queue.peek();
                if(item == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(item).append("\n");
                }
            } else if(command.equals("back")) {
                Integer item = queue.peekLast();
                if(item == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(item).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
