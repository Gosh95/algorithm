package test.baekjoon.java.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dungchi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] dungchi = new int[N][2];
        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            dungchi[i][0] = Integer.parseInt(s[0]);
            dungchi[i][1] = Integer.parseInt(s[1]);
        }

        for(int i = 0; i < N; i++) {
            rank[i] = 1;
            for(int j = 0; j < N; j++) {
                if(i == j) continue;

                if(dungchi[i][0] < dungchi[j][0] && dungchi[i][1] < dungchi[j][1]) {
                    rank[i] += 1;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}
