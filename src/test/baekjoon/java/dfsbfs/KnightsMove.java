package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node3 {
    int x;
    int y;

    Node3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class KnightsMove {
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; //시계방향
    static int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
    static StringBuilder sb = new StringBuilder();
    static Queue<Node3> queue;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            bfs(new Node3(startX, startY), new Node3(endX, endY));
        }

        System.out.println(sb);
    }

    private static void bfs(Node3 startNode, Node3 endNode) {
        visited = new boolean[300][300];
        graph = new int[300][300];

        queue = new LinkedList<>();
        queue.offer(startNode);

        visited[startNode.x][startNode.y] = true;

        while(!queue.isEmpty()) {
            Node3 node = queue.poll();
            if(node.x == endNode.x && node.y == endNode.y) {
                sb.append(graph[node.x][node.y]).append("\n");
                return;
            }

            for(int i = 0; i < 8; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N) {
                    continue;
                }

                if(!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    graph[nx][ny] = graph[node.x][node.y] + 1;
                    queue.offer(new Node3(nx, ny));
                }
            }
        }
    }
}
