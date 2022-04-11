package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> arr = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            arr.add(new int[]{day, score});
        }


        int[] answer = new int[1001];
        while(!arr.isEmpty()) {
            int[] items = arr.poll();
            for(int i = items[0]; i > 0; i--) {
                if(answer[i] == 0) {
                    answer[i]= items[1];
                    break;
                }
            }
        }

        System.out.println(Arrays.stream(answer).sum());
    }
}