package test.programmers.java.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LottoMinAndMax {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] answer = LottoMinAndMax.solution(lottos, win_nums);

        System.out.println(Arrays.toString(answer)); //3, 5
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        Set set = new HashSet(); //간편한 비교를 위해 set 사용

        for(int n : win_nums) {
            set.add(n); //당첨 로또번호 추가
        }

        int same_cnt = 0; //일치 카운트
        int zero_cnt = 0; //0 카운트

        for(int n : lottos) {
            if(set.contains(n)) {
                same_cnt++; //민수의 로또번호와 당첨 로또번호가 일치할 경우 same_cnt 1 증가
            }

            if(n == 0) {
                zero_cnt++; //0일 경우 zero_cnt 1 증가
            }
        }

        answer[0] = Math.min(7 - (same_cnt + zero_cnt), 6); //최고 등수 zero_cnt 가 당첨일 가능성이 있기 때문에 same_cnt + zero_cnt 를 해주고 7을 빼줘서 최대 1등이 나올 수 있게 해준다.
        answer[1] = Math.min(7 - same_cnt, 6); //최저 등수 7 - same_cnt 를 해준다.

        return answer;
    }
}
