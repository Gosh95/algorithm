package test.baekjoon.thisiscodingtest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCardGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");
        int answer = 0;

        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        int[][] matrix = new int[N][M];

        for(int i = 0; i < N; i++) {
            int minValue = 10001;

            for(int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(br.readLine());
                int num = matrix[i][j];
                minValue = Math.min(minValue, num);
            }

            answer = Math.max(answer, minValue);
        }

        System.out.println(answer);
    }
}
