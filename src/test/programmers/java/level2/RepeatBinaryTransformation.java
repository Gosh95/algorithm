package test.programmers.java.level2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RepeatBinaryTransformation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("01110")));
    }

    static public int[] solution(String s) {
        int[] answer = {};
        int count = 0;
        int zeroCount = 0;

        while(!s.equals("1")) {
            String[] str = s.split("");
            zeroCount += Arrays.stream(str).filter(i -> i.equals("0")).count();
            int length = Arrays.stream(str).filter(i -> i.equals("1")).collect(Collectors.joining()).length();
            s = Integer.toBinaryString(length);
            count++;
        }

        answer = new int[]{count, zeroCount};
        return answer;
    }
}
