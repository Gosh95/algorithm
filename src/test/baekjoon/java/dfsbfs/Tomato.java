package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node2 {
    int x;
    int y;

    Node2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Tomato {
    static int[][] graph = new int[1000][1000];
    static boolean[][] visited = new boolean[1000][1000];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int row, column;
    static Queue<Node2> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        column = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();

        boolean isZero = false;
        for(int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < column; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());

                if(graph[i][j] == 1) {
                    queue.offer(new Node2(i, j));
                }

                if(!isZero && graph[i][j] == 0) {
                    isZero = true;
                }
            }
        }

        if(!isZero) {
            System.out.println(0);
        } else {
            System.out.println(bfs());
        }
    }

    static int bfs() {
        while(!queue.isEmpty()) {
            Node2 node = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= row || ny >= column) {
                    continue;
                }

                if(graph[nx][ny] == 0) {
                    graph[nx][ny] = graph[node.x][node.y] + 1;
                    queue.offer(new Node2(nx, ny));
                }
            }
        }

        int answer = 0;
        first:for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(graph[i][j] == 0) {
                    return  -1;
                }

                answer = (int)Math.max(graph[i][j], answer);
            }
        }

        return answer - 1;
    }
}
