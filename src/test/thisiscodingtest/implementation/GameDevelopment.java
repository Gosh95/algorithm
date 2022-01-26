package test.thisiscodingtest.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameDevelopment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]); //맵의 세로 크기
        int M = Integer.parseInt(firstLine[1]); //맵의 가로 크기

        String[] secondLine = br.readLine().split(" ");
        int A = Integer.parseInt(secondLine[0]); //북쪽으로부터 떨어진 칸의 개수 row
        int B = Integer.parseInt(secondLine[1]); //서쪽으로부터 떨어진 칸의 개수 column
        int d = Integer.parseInt(secondLine[2]); //방향 0 북 1 동 2 남 3 서
        int[][] direction = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        int[][] map = new int[N][M];

        for(int i = 0; i < N; i++) {
            String[] mapInfo = br.readLine().split(" ");

            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(mapInfo[j]);
            }
        }

        map[A][B] = 1; //맨 처음 위치는 항상 육지이다.
        int answer = 1; //그렇기 때문에 1로 시작
        int turnCnt = 0;

        while(true) {
            d = d - 1 < 0 ? 3 : d - 1; //방향 회전

            int tempA = 1;
            int tempB = 1;

            tempA = A + direction[d][0];
            tempB = B + direction[d][1];

            if(map[tempA][tempB] == 0) {
                map[tempA][tempB] = 1;
                A = tempA;
                B = tempB;
                answer++;
                turnCnt = 0;

                continue;
            } else {
                turnCnt++;
            }

            if(turnCnt == 4) {
                tempA = A - direction[d][0];
                tempB = B - direction[d][1];

                if(map[tempA][tempB] == 1) {
                    break;
                } else {
                    A = tempA;
                    B = tempB;
                }

                turnCnt = 0;
            }
        }

        System.out.println(answer);
    }
}
