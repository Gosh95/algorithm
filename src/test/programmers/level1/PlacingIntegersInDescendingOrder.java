package test.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class PlacingIntegersInDescendingOrder {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    static long solution(long n) {
        long answer = 0;

        String[] split = String.valueOf(n).split("");

        Arrays.sort(split, Collections.reverseOrder());

        String str = Arrays.stream(split).collect(Collectors.joining());

        answer = Long.valueOf(str);

        return answer;
    }
}
