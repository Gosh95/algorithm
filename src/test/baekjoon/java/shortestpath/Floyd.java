package test.baekjoon.java.shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Floyd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int INF = (int)1e9;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] graph = new int[n + 1][n + 1];
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < n + 1; j++) {
                graph[i][j] = INF;
            }
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(i == j) {
                    graph[i][j] = 0;
                }
            }
        }

        StringTokenizer st;
        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a][b] = Math.min(c, graph[a][b]);
        }

        for(int i = 1; i < n + 1; i++) {
            for(int a = 1; a < n + 1; a++) {
                for(int b = 1; b < n + 1; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][i] + graph[i][b]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(graph[i][j] == INF) {
                    sb.append(0).append(" ");
                } else {
                    sb.append(graph[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}