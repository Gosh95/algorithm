package test.programmers.level2;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(16, 2)));
    }

    static public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for(int i = 1; i < sum; i++) {
            int row = i;
            int column = sum / row;

            if(row > column) continue;

            //갈색 테두리는 노란색을 둘러싸며 무조건 한 줄이어야 한다.
            //그러므로 구해진 행과 열의 갈색 부분인 2 줄을 자르면 노란색 부분만 남게 된다.
            if((row - 2) * (column - 2) == yellow) {
                answer[0] = column;
                answer[1] = row;

                break;
            }
        }

        return answer;
    }
}
