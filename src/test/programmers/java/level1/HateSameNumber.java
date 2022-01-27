package test.programmers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;


public class HateSameNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        int temp = 10; //key Point

        for(int num : arr) {
            if(temp != num) {
                list.add(num);
                temp = num;
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
