package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class FindTheArea {
    static int[][] graph = new int[100][100];
    static boolean[][] visited = new boolean[100][100];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int R, C, K;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int x = y1; x < y2; x++) {
                for(int y = x1; y < x2; y++) {
                    graph[x][y] = 1;
                }
            }
        }

        List<Integer> results = new ArrayList<>();
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(graph[i][j] == 0) {
                    answer = 0;
                    dfs(i, j);
                    results.add(answer);
                }
            }
        }

        Collections.sort(results);
        StringBuilder sb = new StringBuilder();
        sb.append(results.size()).append("\n");
        for(int i = 0; i < results.size(); i++) {
            sb.append(results.get(i)).append(' ');
        }

        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        graph[x][y] = 1;
        answer++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < R && ny < C) {
                if(graph[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
