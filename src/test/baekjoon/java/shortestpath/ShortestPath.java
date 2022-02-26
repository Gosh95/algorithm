package test.baekjoon.java.shortestpath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Vertex implements Comparable<Vertex> {
    int index;
    int distance;

    Vertex(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    public int compareTo(Vertex o) {
        if(this.distance < o.distance) {
            return -1;
        }
        return 1;
    }
}
public class ShortestPath {
    static int INF = (int) 1e9;
    static ArrayList<ArrayList<Vertex>> graph = new ArrayList<>();
    static PriorityQueue<Vertex> queue = new PriorityQueue<>();
    static int[] distance = new int[20001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());

        Arrays.fill(distance, INF);

        for(int i = 0; i < v + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            graph.get(x).add(new Vertex(y, z));
        }

        dijkstra(start);

        for(int i = 1; i < v + 1; i++) {
            if(distance[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(distance[i]);
            }
        }
    }

    static void dijkstra(int start) {
        queue.offer(new Vertex(start, 0));
        distance[start] = 0;

        while(!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            int dist = vertex.distance;
            int now = vertex.index;

            if(distance[now] < dist) {
                continue;
            }

            for(Vertex vtx : graph.get(now)) {
                int cost = distance[now] + vtx.distance;
                if(cost < distance[vtx.index]) {
                    distance[vtx.index] = cost;
                    queue.offer(new Vertex(vtx.index, cost));
                }
            }
        }
    }
}
