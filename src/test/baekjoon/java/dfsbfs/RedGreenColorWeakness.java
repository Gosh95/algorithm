package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedGreenColorWeakness {
    static char[][] graph = new char[100][100];
    static boolean[][] visited = new boolean[100][100];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            for(int j = 0; j < N; j++) {
                graph[i][j] = chars[j];
            }
        }

        int answer1 = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(dfs(i, j)) {
                    answer1++;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(graph[i][j] == 'G') {
                    graph[i][j] = 'R';
                }
            }
        }
        visited = new boolean[100][100];

        int answer2 = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(dfs(i, j)) {
                    answer2++;
                }
            }
        }

        System.out.println(answer1 + " " + answer2);
    }

    static boolean dfs(int x, int y) {
        if(visited[x][y]) {
            return false;
        }

        char lastCh = graph[x][y];
        visited[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N) {
                continue;
            }

            if(graph[nx][ny] == lastCh && !visited[nx][ny]) {
                dfs(nx, ny);
            }
        }

        return true;
    }
}
