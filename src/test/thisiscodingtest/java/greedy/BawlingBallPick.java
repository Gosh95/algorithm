package test.thisiscodingtest.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BawlingBallPick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] weights = new int[N + 1];
        int[] arr = new int[11];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N + 1; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
            arr[weights[i]] += 1;
        }

        int answer = 0;
        for(int i = 1; i < M + 1; i++) {
            N -= arr[i];
            answer += arr[i] * N;
        }

        System.out.println(answer);
    }
}