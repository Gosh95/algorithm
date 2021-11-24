package test.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FailureRate {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, arr)));
    }

    static int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer = new int[N];

        double[] stage = new double[N];
        //각 스테이지에 해당하는 유저 수 배열

        for(int i : stages) {
            if(i == (N + 1)) continue;
            //N + 1 은 마지막 스테이지까지 클리어한 유저이기 때문에 실패율이 0 이라서 그냥 넘긴다.

            stage[i - 1]++; //아니면 스테이지에 맞는 유저수++
        }


        ArrayList<Double> failRate = new ArrayList<>(); //실패율 담을 배열
        double length = stages.length;
        double count = 0;

        for(int i = 0; i < stage.length; i++) {
            count = stage[i];

            if(length != 0) {
                stage[i] = count/length; //실패율
                length -= count; //전체 유저수에서 이미 계산한 유저수 만큼 빼준다
            }

            failRate.add(stage[i]);
        }

        Collections.sort(failRate, Collections.reverseOrder()); //내림차순

        for(int i = 0; i < failRate.size(); i++) {
            for(int j = 0; j < stage.length; j++) {
                if(stage[j] == failRate.get(i)) {
                    answer[i] = j + 1;
                    stage[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
