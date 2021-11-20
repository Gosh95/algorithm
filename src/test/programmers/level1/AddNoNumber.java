package test.programmers.level1;

import java.util.Arrays;

public class AddNoNumber {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }
    static int solution(int[] numbers) {
        int answer = 0;
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arrSum = 0;
        int numbersSum = 0;

        for(int n : arr) {
            arrSum += n;
        }

        for(int number : numbers) {
            numbersSum += number;
        }

        answer = arrSum - numbersSum;

        return answer;
    }
}
