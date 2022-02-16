package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Camping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = 1;
        while(true) {
            int[] items = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int L = items[0], P = items[1], V = items[2];
            if(L == 0 && P == 0 && V == 0) {
                break;
            }
            int result = ((V / P) * L) + Math.min((V % P), L);
            sb.append("Case ").append(count++).append(": ").append(result).append("\n");
        }

        System.out.println(sb);
    }
}
