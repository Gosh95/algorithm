package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class Alphabet {
    static int[][] graph = new int[21][21];
    static boolean[] visited = new boolean[26];
    static Set<Character> set;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int R, C;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] items = br.readLine().split(" ");
        R = Integer.parseInt(items[0]);
        C = Integer.parseInt(items[1]);

        for(int i = 0; i < R; i++) {
            char[] chars = br.readLine().toCharArray();
            for(int j = 0; j < C; j++) {
                graph[i][j] = chars[j] - 'A';
            }
        }

        dfs(0, 0, 0);

        System.out.println(answer);
    }

    static void dfs(int x, int y, int count) {
        if(visited[graph[x][y]]) {
            answer = (int)Math.max(count, answer);
            return;
        }

        visited[graph[x][y]] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= R || ny >= C) {
                continue;
            }

            dfs(nx, ny, count + 1);
        }

        visited[graph[x][y]] = false;
    }
}
