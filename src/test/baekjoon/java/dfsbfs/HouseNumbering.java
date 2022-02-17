package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HouseNumbering {
    static int[][] graph = new int[25][25];
    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited = new boolean[25][25];
    static int count = 0;
    static int[] results = new int[25 * 25];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String[] values = br.readLine().split("");
            for(int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(values[j]);
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(visited[i][j] == false && graph[i][j] == 1) {
                    dfs(i, j);
                    queue.add(results[count]);
                    count++;
                }
            }
        }



        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");
        while(!queue.isEmpty()) {
            sb.append(queue.poll()).append("\n");
        }

        System.out.println(sb);
    }


    static void dfs(int x, int y) {
        visited[x][y] = true;
        results[count]++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];


            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if(graph[nx][ny] == 1 && visited[nx][ny] == false) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
