package test.baekjoon.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LIS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        int[] sequences = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < A; i++) {
            sequences[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[1000];
        Arrays.fill(dp, 1);

        for(int i = 0; i < A; i++) {
            for(int j = 0; j < i; j++) {
                if(sequences[i] > sequences[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for(int i : dp) {
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}
