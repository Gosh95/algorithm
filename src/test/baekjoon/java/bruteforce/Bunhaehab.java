package test.baekjoon.java.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunhaehab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        int start = N - (String.valueOf(N).length() * 9);
        for(int i = start; i < N; i++) {
            int num = i, sum = i;
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if(N == sum) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
