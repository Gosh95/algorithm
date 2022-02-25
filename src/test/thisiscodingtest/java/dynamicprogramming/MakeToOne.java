package test.thisiscodingtest.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeToOne {
    static int[] d = new int[30001];
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        System.out.println(dynamicProgramming(N));
    }
    static int dynamicProgramming(int n) {
        for(int i = 2; i < n + 1; i++) {
            d[i] = d[i - 1] + 1;

            if(i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            } else if(i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            } else if(i % 5 == 0) {
                d[i] = Math.min(d[i], d[i / 5] + 1);
            }
        }

        return d[n];
    }
}
