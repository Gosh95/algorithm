package test.baekjoon.java.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StandInLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] lines = new int[N];
        Arrays.fill(lines, 0);

        for(int n = 1; n < N + 1; n++) {
            int idx = arr[n - 1];
            int zeroCount = 0;

            for(int i = 0; i < N; i++) {
                if(zeroCount == idx && lines[i] == 0) {
                    lines[i] = n;
                    break;
                } else if(lines[i] == 0) {
                    zeroCount++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(lines[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}