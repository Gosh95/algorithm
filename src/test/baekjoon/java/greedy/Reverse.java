package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int zeroCount = 0;
        int oneCount= 0;

        if(S.charAt(0) == '1') {
            zeroCount += 1;
        } else {
            oneCount += 1;
        }
        for(int i = 0; i < S.length() - 1; i++) {
            char a = S.charAt(i);
            char b = S.charAt(i + 1);
            if(a == '1' && b == '0') {
                oneCount += 1;
            } else if(a == '0' && b == '1') {
                zeroCount += 1;
            }
        }

        System.out.println(Math.min(zeroCount, oneCount));
    }
}
