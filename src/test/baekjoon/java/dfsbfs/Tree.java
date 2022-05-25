package test.baekjoon.java.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Tree {

    static List<List<Integer>> graph;
    static int answer = 0;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        int[] tree = new int[n];
        int root = -1;

        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (tree[i] == -1) {
                root = i;
            } else {
                graph.get(tree[i]).add(i);
            }
        }

        if (root == k) {
            System.out.println(0);
        } else {
            dfs(root);
            System.out.println(answer);
        }
    }

    static void dfs(int node) {
        if (graph.get(node).isEmpty()) {
            answer++;

            return;
        }

        List<Integer> children = graph.get(node);

        for (int i = 0; i < children.size(); i++) {
            if (children.get(i) == k) {
                if (children.size() == 1) {
                    answer++;
                }
            } else {
                dfs(children.get(i));
            }
        }
    }
}
