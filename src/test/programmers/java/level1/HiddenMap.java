package test.programmers.java.level1;

import java.util.Arrays;

public class HiddenMap {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        Arrays.toString(solution(5, arr1, arr2));
    }

    static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];

        for(int i = 0; i < n; i++) {
            String temp = "";
            String binary1 = Integer.toBinaryString(arr1[i]);
            while(binary1.length() < n) binary1 = "0" + binary1;

            String binary2 = Integer.toBinaryString(arr2[i]);
            while(binary2.length() < n) binary2 = "0" + binary2;

            for(int j = 0; j < n; j++) {
                temp += (binary1.charAt(j) - '0' + binary2.charAt(j) - '0' == 0) ? " " : "#";
            }

            answer[i] = temp;
        }

        return answer;
    }

}
