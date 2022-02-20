package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class VillageCount {
    static int answer = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[101];
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int findX = Integer.parseInt(st.nextToken());
        int findY = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(graph, visited, findX, findY, 0);

        System.out.println(answer);
    }

    static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int pos, int find, int count) {
        visited[pos] = true;

        for(int i : graph.get(pos)) {
            if(!visited[i]) {
                if(i == find) {
                    answer = count + 1;
                    return;
                }

                dfs(graph, visited, i, find, count + 1);
            }
        }
    }
}
