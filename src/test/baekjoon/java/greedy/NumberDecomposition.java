package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberDecomposition {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 4;

        for(int i = 5; i < N + 1; i++) {
            dp[i] = (dp[i - 3] * 3) % 10007;
        }

        System.out.println(dp[N]);
    }
}
