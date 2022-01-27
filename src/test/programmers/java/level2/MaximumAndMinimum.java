package test.programmers.java.level2;

import java.util.Arrays;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
    }

    static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int[] nums = Arrays.stream(s.split(" ")).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();

        int lastIdx = nums.length - 1;

        sb.append(nums[0]).append(' ').append(nums[lastIdx]);

        answer = sb.toString();

        return answer;
    }
}
