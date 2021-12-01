package test.programmers.level1;

import java.util.Arrays;
import java.util.*;

public class PlacingStringsInDescendingOrder {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    static String solution(String s) {
        String answer = "";

        String[] str = s.split("");

        Arrays.sort(str, Comparator.reverseOrder());

        for(String i : str) {
            answer += i;
        }

        /*  스트림을 사용해서 코드 한 줄로 처리할 수도 있음.
            answer = Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
         */

        return answer;
    }
}
