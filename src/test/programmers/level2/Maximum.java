package test.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println(solution(numbers));
    }

    static public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String answer = "";

        String[] nums = new String[numbers.length];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if(nums[0].equals("0")) return "0";

        for(String s : nums) {
            answer += s;
        }

        return answer;
    }
}
