package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SafeZone {
    static int[][] graph = new int[100][100];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int maxHeight = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = (int) Math.max(maxHeight, graph[i][j]);
            }
        }

        int answer = 0;
        for(int i = 0; i < maxHeight + 1; i++) {
            int count = 0;
            visited = new boolean[100][100];
            for(int x = 0; x < N; x++) {
                for(int y = 0; y < N; y++) {
                    if(dfs(x, y, i)) {
                        count++;
                    }
                }
                answer = (int)Math.max(count, answer);
            }
        }

        System.out.println(answer);
    }

    private static boolean dfs(int x, int y, int i) {
        if(visited[x][y] || graph[x][y] <= i) {
            return false;
        }

        visited[x][y] = true;

        for(int j = 0; j < 4; j++) {
            int nx = x + dx[j];
            int ny = y + dy[j];

            if(nx < 0 || ny < 0 || nx >= N || ny >= N) {
                continue;
            }

            if(graph[nx][ny] <= i) {
                continue;
            }

            if(graph[nx][ny] > i && !visited[nx][ny]) {
                dfs(nx, ny, i);
            }
        }

        return true;
    }
}
