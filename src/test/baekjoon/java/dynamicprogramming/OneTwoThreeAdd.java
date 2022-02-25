package test.baekjoon.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreeAdd {
    static int[] d = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(function(n));
        }
    }

    static int function(int num) {
        for(int i = 4; i < num + 1; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }

        return d[num];
    }
}