package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferenceBetween5And6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] items = br.readLine().split(" ");
        String A = items[0];
        String B = items[1];

        int min = Integer.parseInt(A.replace("6", "5")) + Integer.parseInt(B.replace("6", "5"));
        int max = Integer.parseInt(A.replace("5", "6")) + Integer.parseInt(B.replace("5", "6"));

        System.out.println(min + " " + max);
    }
}
