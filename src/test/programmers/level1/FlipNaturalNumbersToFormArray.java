package test.programmers.level1;

import java.util.*;

public class FlipNaturalNumbersToFormArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    static int[] solution(long n) {
        int[] answer = {};

        String str = String.valueOf(n);

        int size = str.length();

        answer = new int[size];

        for(int i = size - 1; i >= 0; i--) {
            answer[(size - 1) - i] = str.charAt(i) - '0';
        }

        return answer;
    }
}
