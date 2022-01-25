package test.thisiscodingtest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UntilItBecomeOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");
        int count = 0;

        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        while(N != 1) {
            if(N % K == 0) {
                N = N / K;
                count++;
            } else {
                N--;
                count++;
            }
        }

        System.out.println(count);
    }
}
