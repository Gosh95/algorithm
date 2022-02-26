package test.thisiscodingtest.java.shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int index;
    int distance;

    Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o) {
        if(this.distance < o.distance) {
            return - 1;
        }

        return 1;
    }
}

public class Telegram {
    static PriorityQueue<Node> queue = new PriorityQueue<>();
    static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
    static int n, m, start;
    static int INF = (int) 1e9;
    static int[] distance = new int[30001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n + 1; i ++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, c));
        }

        Arrays.fill(distance, INF);

        dijkstra(start);

        int count = 0;
        int maxDistance = 0;
        for(int i = 1; i < n  + 1; i++) {
            if(distance[i] != INF) {
                count += 1;
                maxDistance = Math.max(maxDistance, distance[i]);
            }
        }

        System.out.println(count - 1 + " " + maxDistance);
    }

    static void dijkstra(int start) {
        queue.offer(new Node(start, 0));
        distance[start] = 0;

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int dist = node.distance;
            int now = node.index;

            if(distance[now] < dist) {
                continue;
            }

            for(Node i : graph.get(now)) {
                int cost = i.distance + distance[now];
                if(cost < distance[i.index]) {
                    distance[i.index] = cost;
                    queue.offer(new Node(i.index, cost));
                }
            }
        }
    }
}
