package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exchange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int payed = 1000;
        int N = Integer.parseInt(br.readLine());
        int exchange = payed - N;
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};
        int count = 0;
        for(int i = 0; i < coins.length; i++) {
            count += exchange / coins[i];
            exchange %= coins[i];
        }

        System.out.println(count);
    }
}
