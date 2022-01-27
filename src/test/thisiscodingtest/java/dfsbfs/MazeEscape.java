package test.thisiscodingtest.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }
}

public class MazeEscape {
    static int N, M;
    static int[][] maze = new int[201][201];
    //상, 하, 좌, 우
    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};

    static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(x, y));

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if(maze[nx][ny] == 0) continue;

                if(maze[nx][ny] == 1) {
                    maze[nx][ny] = maze[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }

        return maze[N - 1][M - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        for(int i = 0; i < N; i++) {
            String[] split = br.readLine().split("");

            for(int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(split[j]);
            }
        }

        System.out.println(bfs(0 , 0));
    }

}
/*
5 6
101010
111111
000001
111111
111111*/
