package test.programmers.level1;

import java.util.Arrays;

public class GreatestCommonFactorAndLeastCommonMultiple {
    static int[] solution(int n, int m) {
        int[] answer = {};

        if(n > m) {
            int temp = n;
            n = m;
            m = n;
        }

        int commonFactor = 0;
        int commonMultiple = 0;

        if(m % n == 0) {
            commonFactor = n;
        } else {
            for(int i = 1; i <= n; i++) {
                if(m % i == 0 && n % i == 0) commonFactor = i;
            }
        }

        commonMultiple = m % n == 0 ? m / commonFactor * n : m * n;

        answer = new int[]{commonFactor, commonMultiple};

        return answer;
    }
}
