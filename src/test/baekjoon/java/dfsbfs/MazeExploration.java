package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x;
    int y;

    Node (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class MazeExploration {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] graph = new int[100][100];
    static boolean[][] visited = new boolean[100][100];
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] items = br.readLine().split(" ");
        N = Integer.parseInt(items[0]);
        M = Integer.parseInt(items[1]);

        for(int i = 0; i < N; i++) {
            String[] values = br.readLine().split("");
            for(int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(values[j]);
            }
        }



        System.out.println(bfs(0, 0));
    }
    static private int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                if(graph[nx][ny] == 0) {
                    continue;
                }

                if(!visited[nx][ny] && graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[node.x][node.y] + 1;
                    visited[nx][ny] = true;
                    queue.offer(new Node(nx, ny));
                }
            }
        }

        return graph[N - 1][M - 1];
    }
}
