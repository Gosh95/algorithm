package test.programmers.level1;

import java.util.Arrays;

public class NumberOfKth {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] matrix = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(arr, matrix)));
    }
    static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {
            int from = commands[i][0] - 1;
            int to = commands[i][1];
            int idx = commands[i][2];
            int[] temp = new int[to - from];
            int j = 0;

            for(; from < to; from++) {
                temp[j] = array[from];
                j++;
            }

            Arrays.sort(temp);
            for(int k = 0; k < temp.length; k++) {
                System.out.println(temp[k]);
            }
            answer[i] = temp[idx - 1];
        }

        return answer;
    }
}

//ㅈㄴ 쉬운 방법 copyOfRange!!
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
