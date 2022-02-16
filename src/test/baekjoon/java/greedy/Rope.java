package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rope {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] weights = new int[N];
        for(int i = 0; i < N; i++) {
            weights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(weights);

        int maxWeight = -1;
        for(int i = 0; i < N; i++) {
            maxWeight = Math.max(maxWeight, weights[i] * (N - i));
        }

        System.out.println(maxWeight);
    }
}
