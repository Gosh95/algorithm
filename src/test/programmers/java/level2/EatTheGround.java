package test.programmers.java.level2;

import java.util.Arrays;

public class EatTheGround {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        System.out.println(solution(arr));
    }

    static int solution(int[][] land) {
        int answer = 0;

        for(int i = 1; i < land.length; i++) {
            //각 열의 가장 큰 값을 찾아서 다음 행에 더해준다.
            //각 열의 가장 큰 값을 찾을 때 해당 인덱스는 제외하고 비교한다.
            //결과가 가장 큰 값이 answer 가 된다.
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][1], land[i - 1][0]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][0]);
        }

        answer = Arrays.stream(land[land.length - 1]).max().getAsInt();

        return answer;
    }
}
