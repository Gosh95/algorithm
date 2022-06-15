package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FindParentsOfTree {

    static int n;
    static List<Integer>[] treeList;
    static boolean[] visited;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        treeList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        answer = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            treeList[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            treeList[x].add(y);
            treeList[y].add(x);
        }

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        for (int i = 2; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void dfs(int parent) {
        if (visited[parent]) {
            return;
        }

        visited[parent] = true;

        for (int n : treeList[parent]) {
            if (answer[n] == 0) {
                answer[n] = parent;
                dfs(n);
            }
        }
    }
}
