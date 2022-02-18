package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfIslands {
    static int[][] graph;
    static int w, h;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true) {
            int answer = 0;
            graph = new int[50][50];
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0) break;

            for(int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int x = 0; x < h; x++) {
                for(int y = 0; y < w; y++) {
                    if(dfs(x, y) == true) {
                        answer++;
                    }
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }

    private static boolean dfs(int x, int y) {
        if(x < 0 || y < 0 || x >= h || y >= w) {
            return false;
        }

        if(graph[x][y] == 1) {
            graph[x][y] = 0;

            dfs(x - 1, y); //상
            dfs(x + 1, y); //하
            dfs(x, y - 1); //좌
            dfs(x, y + 1); //우
            dfs(x - 1, y - 1); //좌상
            dfs(x + 1, y - 1); //좌하
            dfs(x - 1, y + 1); //우상
            dfs(x + 1, y + 1); //우하

            return true;
        }

        return false;
    }
}
