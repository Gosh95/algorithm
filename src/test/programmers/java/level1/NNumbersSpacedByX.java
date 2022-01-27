package test.programmers.java.level1;

import java.util.Arrays;

public class NNumbersSpacedByX {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4, 5)));
    }

    static long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        long num = x;

        for(int i = 0; i < n; i++) {
            answer[i] = num;
            num += x;
        }

        return answer;
    }
}
