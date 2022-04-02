package test.baekjoon.java.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SumOfNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int start = 0, end = 0, answer = 0;

        while(end <= N && start <= end) {
            int sum = arr.subList(start, end).stream().mapToInt(i -> i).sum();

            if(sum == M) {
                answer++;
                start++;
            } else if(sum > M) {
                start++;
            } else {
                end++;
            }
        }

        System.out.println(answer);
    }
}
