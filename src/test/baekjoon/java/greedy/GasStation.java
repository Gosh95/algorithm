package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GasStation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] distance = new long[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        long[] price = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        long lowPrice = price[0];
        long answer = lowPrice * distance[0];

        for(int i = 1; i < N - 1; i++) {
            lowPrice = Math.min(lowPrice, price[i]);
            answer += lowPrice * distance[i];
        }

        System.out.println(answer);
    }
}
