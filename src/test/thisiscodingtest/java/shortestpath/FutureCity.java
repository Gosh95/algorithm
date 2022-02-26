package test.thisiscodingtest.java.shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FutureCity {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[][] graph = new long[101][101];
        long INF = (int) 1e9;

        for(int i = 1; i < n + 1; i++) {
            Arrays.fill(graph[i], INF);
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < n + 1; j++) {
                if(i == j) {
                    graph[i][j] = 0;
                }
            }
        }

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for(int i = 1; i < n + 1; i ++) {
            for(int a = 1; a < n + 1; a++) {
                for(int b = 1; b < n + 1; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][i] + graph[i][b]);
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long distance = graph[1][k] + graph[k][x];

        if(distance >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(distance);
        }
    }
}
