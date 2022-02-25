package test.thisiscodingtest.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] d = new int[10001];
        Arrays.fill(d, 10001);
        int[] coins = new int[N];
        for(int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        d[0] = 0;
        for(int i = 0; i < N; i++) {
            for(int j = coins[i]; j < M + 1; j++) {
                if(d[j - coins[i]] != 10001) {
                    d[j] = Math.min(d[j - coins[i]] + 1, d[j]);
                }
            }
        }

        if(d[M] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(d[M]);
        }

    }
}
