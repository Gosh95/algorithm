package test.baekjoon.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZeroOneTile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] d = new int[10000001];
        d[1] = 1;
        d[2] = 2;

        for(int i = 3; i < N + 1; i++) {
            d[i] = (d[i - 1] + d[i - 2]) % 15746;
        }

        System.out.println(d[N]);
    }
}
