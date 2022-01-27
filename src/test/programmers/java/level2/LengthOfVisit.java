package test.programmers.java.level2;

public class LengthOfVisit {
    public static void main(String[] args) {
        LengthOfVisit lov = new LengthOfVisit();
        System.out.println(lov.solution("ULURRDLLU"));
    }

    //U, D, R, L
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};
    //현재위치(2차원), 이동위치(2차원)
    public static boolean[][][][] visit = new boolean[11][11][11][11];

    public int solution(String dirs) {
        int answer = 0;

        //이동 전 위치
        int x = 0;
        int y = 0;

        //기본 위치 || 이동 후 위치, 문제 범위 5 ~ -5, 배열 크기 0 ~ 10
        int nextX = 5;
        int nextY = 5;

        int index = 0;

        for (int i = 0; i < dirs.length(); i++) {
            x = nextX;
            y = nextY;

            if(dirs.charAt(i) == 'U') {
                index = 0;
            } else if(dirs.charAt(i) == 'D') {
                index = 1;
            } else if(dirs.charAt(i) == 'R') {
                index = 2;
            } else if(dirs.charAt(i) == 'L') {
                index = 3;
            }

            nextX += dx[index];
            nextY += dy[index];

            if(nextX < 0 || nextY < 0 || nextX > 10 || nextY > 10) {
                nextX -= dx[index];
                nextY -= dy[index];
                continue;
            }

            //길이기 때문에 양방향으로 체크해줘야 함.
            if(!visit[x][y][nextX][nextY] && !visit[nextX][nextY][x][y]) {
                visit[x][y][nextX][nextY] = true;
                visit[nextX][nextY][x][y] = true;
                answer++;
            }
        }

        return answer;
    }
}
