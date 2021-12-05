package test.programmers.level1;

import java.util.Arrays;

public class RemoveSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
        int[] answer = {};

        int[] temp = arr.clone();

        Arrays.sort(temp);

        int min = temp[0];

        if(temp.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = Arrays.stream(arr).filter(i -> i > min).toArray();
        }

        return answer;
    }
}
