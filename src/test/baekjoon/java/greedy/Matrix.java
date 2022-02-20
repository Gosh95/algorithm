package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix {
    static int[][] matrixA;
    static int[][] matrixB;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        matrixA = new int[R][C];
        matrixB = new int[R][C];

        for(int i = 0; i < R; i++) {
            String[] items = br.readLine().split("");
            for(int j = 0; j < C; j++) {
                matrixA[i][j] = Integer.parseInt(items[j]);
            }
        }

        for(int i = 0; i < R; i++) {
            String[] items = br.readLine().split("");
            for(int j = 0; j < C; j++) {
                matrixB[i][j] = Integer.parseInt(items[j]);
            }
        }

        int answer = 0;
        for(int i = 0; i < R - 2; i++) {
            for(int j = 0; j < C - 2; j++) {
                if(matrixA[i][j] != matrixB[i][j]) {
                    change(i, j);
                    answer++;
                }
            }
        }

        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(matrixA[i][j] != matrixB[i][j]) {
                    answer = -1;
                }
            }
        }

        System.out.println(answer);
    }
    static void change(int x, int y) {
        for(int i = x; i < x + 3; i++) {
            for(int j = y; j < y + 3; j++) {
                matrixA[i][j] = 1 - matrixA[i][j];
            }
        }
    }
}
