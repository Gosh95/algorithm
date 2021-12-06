package test.programmers.level1;

import java.util.Arrays;

public class GreatestCommonDivisorAndLeastCommonMultiple {
    static int[] solution(int n, int m) {
        int[] answer = {};
        int min = n;
        int max = m;

        if(min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        int gcd = calcGCD(min, max);
        int lcm = (min * max) / gcd;

        answer = new int[]{gcd, lcm};

        return answer;
    }

    static int calcGCD(int min, int max) {
        //유클리드 호제법
        while(true) {
            if(max % min == 0) {
                return min;
            } else {
                int temp = max % min;
                max = min;
                min = temp;
            }
        }
    }
}
