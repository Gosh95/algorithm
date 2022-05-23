package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class CheeseNode {
    int x;
    int y;

    public CheeseNode(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Cheese {
    static int[][] cheeses = new int[100][100];
    static int n;
    static int m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            cheeses[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int answer = 0;

        while (true) {
            bfs();
            boolean melted = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (cheeses[i][j] >= 3) {
                        cheeses[i][j] = 0;
                        melted = true;
                    } else if (cheeses[i][j] == 2) {
                        cheeses[i][j] = 1;
                    }
                }
            }

            if (melted) {
                answer++;
            } else {
                break;
            }
        }

        System.out.println(answer);
    }

    static void bfs() {
        Deque<CheeseNode> q = new LinkedList<>();
        q.add(new CheeseNode(0, 0));
        boolean[][] visited = new boolean[100][100];

        while (!q.isEmpty()) {
            CheeseNode cheeseNode = q.pollFirst();

            for (int i = 0; i < 4; i++) {
                int nx = cheeseNode.x + dx[i];
                int ny = cheeseNode.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (!visited[nx][ny]) {
                  if (cheeses[nx][ny] >= 1) {
                      cheeses[nx][ny] += 1;
                  } else {
                      visited[nx][ny] = true;
                      q.add(new CheeseNode(nx, ny));
                  }
                }
            }
        }
    }
}
