package test.baekjoon.java.for문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusBminusThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int A;
        int B;

        for(int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            A = Integer.parseInt(str[0]);
            B = Integer.parseInt(str[1]);

            System.out.println(A + B);
        }
    }
}
