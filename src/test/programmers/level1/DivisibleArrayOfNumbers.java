package test.programmers.level1;

import java.util.ArrayList;

public class DivisibleArrayOfNumbers {
    int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr) {
            if(num % divisor == 0) {
                cnt++;
                list.add(num);
            }
        }

        if(cnt == 0) list.add(-1);

        answer = list.stream().sorted().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
