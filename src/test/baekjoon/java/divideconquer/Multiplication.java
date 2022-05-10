package test.baekjoon.java.divideconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Multiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(dac(A, B, C));
    }

    static long dac(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        }

        long half = dac(a, b / 2, c);

        if (b % 2 == 0) {
            return half * half % c;
        } else {
            return half * half * a % c;
        }
    }
}
