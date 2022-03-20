package test.programmers.java.level3;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(visited[i] == false) {
                dfs(n, computers, visited, i);
                answer++;
            }
        }

        return answer;
    }

    static void dfs(int n, int[][] computers, boolean[] visited, int i) {
        visited[i] = true;

        for(int j = 0; j < n; j++) {
            if(visited[j] == false && computers[i][j] == 1) {
                dfs(n, computers, visited, j);
            }
        }
    }
}
