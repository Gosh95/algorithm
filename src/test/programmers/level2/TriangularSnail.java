package test.programmers.level2;

import java.util.Arrays;

public class TriangularSnail {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4)));
    }

    static public int[] solution(int n) {
        /*
            https://minhamina.tistory.com/58
            1 = 1
            2 = 1 + 2
            3 = 1 + 2 + 3
            ......
            이 패턴을 공식으로 나타내면 (n * (n + 1)) / 2 가 나온다고 한다.
        */
        int[] answer = new int[(n * (n + 1)) / 2];
        int[][] matrix = new int[n][n];
        int num = 1;
        int x = -1, y = 0;

        //행 열 대각선 순으로 숫자가 채워지는 패턴이 이루어진다.
        //그렇기 때문에 3으로 나누어 나머지 0은 행, 1은 열, 2는대각선 방향으로 가게끔 인덱스를 조정한다.
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i % 3 == 0) {
                    x++;
                } else if(i % 3 == 1) {
                    y++;
                } else if(i % 3 == 2) {
                    x--;
                    y--;
                }

                matrix[x][y] = num++;
            }
        }

        int idx = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    break;
                }

                answer[idx++] = matrix[i][j];
            }
        }

        return answer;
    }
}
