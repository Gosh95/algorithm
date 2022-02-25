package test.baekjoon.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFunction {
    static int[] zero = new int[41];
    static int[] one = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        zero[0] = 1;
        zero[1] = 0;
        zero[2] = 1;

        one[0] = 0;
        one[1] = 1;
        one[2] = 1;

        for(int i = 0; i < T; i++) {
            fibonacciFunction(Integer.parseInt(br.readLine()));
        }
    }

    static void fibonacciFunction(int num) {
        if(num >= 3) {
            for(int i = 3; i < num + 1; i++) {
                zero[i] = zero[i - 1] + zero[i - 2];
                one[i] = one[i - 1] + one[i - 2];
            }
        }

        System.out.println(zero[num] + " " + one[num]);
    }
}
