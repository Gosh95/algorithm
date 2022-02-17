package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GuitarStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] items = br.readLine().split(" ");
        int N = Integer.parseInt(items[0]);
        int M = Integer.parseInt(items[1]);

        int minP = 1001, minS = 1001;
        for(int i = 0; i < M; i++) {
            int[] prices = Arrays.stream(br.readLine()
                    .split(" ")).mapToInt(Integer::parseInt).toArray();
            int p = prices[0], s = prices[1];
            minP = Math.min(p, minP);
            minS = Math.min(s, minS);
        }

        int quantity = 6;
        int planA = (minP * (int)Math.ceil(N / (float)quantity)); //올 패키지
        int planB = N * minS; //올 낱개
        int planC = (minP * (N / quantity)) + ((N % quantity) * minS); //패키지 + 낱개

        int answer = (int)Math.min(Math.min(planA, planB), planC);
        System.out.println(answer);
    }
}
