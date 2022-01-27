package test.programmers.java.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TakeTwoAndAdd {
    public static void main(String[] args) {
        int[] arr = {5, 0, 2, 7};

        System.out.println(Arrays.toString(solution(arr)));
    }
    static int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++)
                set.add(numbers[i] + numbers[j]);
        }

        List<Integer> list = set.stream().sorted().collect(Collectors.toList());

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
