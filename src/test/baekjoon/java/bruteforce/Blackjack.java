package test.baekjoon.java.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blackjack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] num = new int[N];
        String[] inputNums = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(inputNums[i]);
        }

        int answer = 0;
        first:for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = num[i] + num[j] + num[k];
                    if(sum > M) continue;
                    if(sum == M) {
                        answer = sum;
                        break first;
                    } else if(sum < M) {
                        answer = Math.max(sum, answer);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
