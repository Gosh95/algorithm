package test.programmers.level1;

import java.util.Arrays;
import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] answer = Lotto.solution(lottos, win_nums);

        System.out.println(Arrays.toString(answer)); //3, 5
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        HashSet set = new HashSet();

        for(int n : win_nums) {
            set.add(n);
        }

        int same_cnt = 0;
        int zero_cnt = 0;

        for(int n : lottos) {
            if(set.contains(n)) {
                same_cnt++;
            }

            if(n == 0) {
                zero_cnt++;
            }
        }

        answer[0] = Math.min(7 - (same_cnt + zero_cnt), 6);
        answer[1] = Math.min(7 - same_cnt, 6);

        return answer;
    }
}
