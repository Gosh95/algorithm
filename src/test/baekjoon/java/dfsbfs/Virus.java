package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Virus {
    static int N, M;
    static int[][] network;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        network = new int[101][101];
        visited = new boolean[101];

        for(int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            network[x][y] = network[y][x] = 1;
        }

        int virusComputer = 1;

        bfs(virusComputer);
        System.out.println(count);
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int computer = queue.poll();

            for(int i = 1; i <= N; i++) {
                if(!visited[i] && network[computer][i] == 1) {
                    queue.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
    }
}

