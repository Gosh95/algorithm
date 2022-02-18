package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfConnectingElements {
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        int answer = 0;
        for(int i = 1; i < N + 1; i++) {
            if(dfs(i)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    static boolean dfs(int idx) {
        if(visited[idx]) {
            return false;
        }

        visited[idx] = true;
        for(int i = 1; i < N + 1; i++) {
            if(graph[idx][i] == 1) {
                dfs(i);
            }
        }
        return true;
    }
}
