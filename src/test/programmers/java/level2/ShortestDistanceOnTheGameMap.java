package test.programmers.java.level2;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceOnTheGameMap {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int row, col;
    static Queue<int[]> queue = new LinkedList<>();
    public int solution(int[][] maps) {
        return bfs(maps, 0, 0) == 1 ? -1 : bfs(maps, 0, 0);
    }

    static int bfs(int[][] graph, int x, int y) {
        row = graph.length;
        col = graph[0].length;

        queue.offer(new int[]{x, y});

        while(!queue.isEmpty()) {
            int[] node = queue.poll();
            x = node[0];
            y = node[1];
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= row || ny >= col) {
                    continue;
                }

                if(graph[nx][ny] == 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return graph[row - 1][col - 1];
    }
}
