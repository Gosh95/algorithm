package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreeNumbersTwoM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        int diffOfNum = 0;

        for (int i = 1; i < n - 1; i++) {
            diffOfNum = Math.max(diffOfNum, Math.abs(-numbers[0] + (2 * numbers[i]) - numbers[i + 1]));
        }

        for (int i = 0; i < n - 2; i++) {
            diffOfNum = Math.max(diffOfNum, Math.abs(numbers[n - 1] - (2 * numbers[i + 1]) + numbers[i]));
        }

        System.out.println(diffOfNum);
    }
}
