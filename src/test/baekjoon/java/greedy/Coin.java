package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int answer = 0;
        Integer[] coins = new Integer[N];

        for(int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for(int i = N - 1; i > -1; i--) {
            if(coins[i] > K) continue;
            answer += K / coins[i];
            K %= coins[i];
            if(K < 1) break;
        }

        System.out.println(answer);
    }
}
