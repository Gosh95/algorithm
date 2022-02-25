package test.thisiscodingtest.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorConstruction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] d = new int[1001];
        d[1] = 1;
        d[2] = 3;

        for(int i = 3; i < N + 1; i++) {
            d[i] = (d[i - 2] * 2) + d[i - 1];
        }

        System.out.println(d[N]);
    }
}
