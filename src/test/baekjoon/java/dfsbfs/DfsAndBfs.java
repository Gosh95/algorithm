package test.baekjoon.java.dfsbfs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DfsAndBfs {
    static boolean[] visited;
    static int[][] matrix;
    static int N, M, V;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        V = scanner.nextInt();

        matrix = new int[1001][1001];
        visited = new boolean[1001];

        for(int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            matrix[x][y] = matrix[y][x] = 1;
        }

        dfs(V);
        System.out.println();
        visited = new boolean[1001];
        bfs(V);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        System.out.print(start + " ");

        while(!queue.isEmpty()) {
            int node = queue.poll();

            for(int i = 1; i <= N; i++) {
                if(!visited[i] && matrix[node][i] == 1) {
                    queue.offer(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    static void dfs(int start) {
        visited[start] = true;

        System.out.print(start + " ");

        for(int i = 1; i <= N; i++) {
            if(matrix[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}
