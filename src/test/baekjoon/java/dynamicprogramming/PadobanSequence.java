package test.baekjoon.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PadobanSequence {
    static long[] d = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        d[1] = 1;
        d[2] = 1;
        d[3] = 1;

        while(T-- > 0) {
            System.out.println(function(Integer.parseInt(br.readLine())));
        }
    }

    static long function(int num) {
        for(int i = 4; i < num + 1; i++) {
            d[i] = d[i - 2] + d[i - 3];
        }

        return d[num];
    }
}