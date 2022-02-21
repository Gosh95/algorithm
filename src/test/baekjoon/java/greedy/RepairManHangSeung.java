package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RepairManHangSeung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] spot = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            spot[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(spot);

        int tape = 0;
        int answer = 0;
        for(int i : spot) {
            if(tape < i) {
                tape = (i + L) - 1;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
