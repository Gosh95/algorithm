package test.thisiscodingtest.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FreezeDrinks {
    static int N, M;
    static int[][] matrix = new int[1000][1000];

    static boolean dfs(int x, int y) {
        if(x < 0 || x >= N || y < 0 || y >= M) {
            return false;
        }

        if(matrix[x][y] == 0) {
            matrix[x][y] = 1;

            dfs(x + 1, y);
            dfs(x - 1, y);
            dfs(x, y + 1);
            dfs(x, y - 1);

            return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);

        for(int i = 0; i < N; i++) {
            String[] split = br.readLine().split("");
            for(int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(split[j]);
            }
        }

        int answer = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(dfs(i, j)) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}


/*
4 5
00110
00011
11111
00000*/
