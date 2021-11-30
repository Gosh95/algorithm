package test.programmers.level1;

import java.util.stream.Stream;

public class SumBetweenTwoIntegers {
    public static void main(String[] args) {

    }
    static long solution(int a, int b) {
        long answer = 0;

        if(a > b) {
            int temp = a;

            a = b;
            b = temp;
        }

        for(int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}
