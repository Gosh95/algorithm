package test.programmers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MockExam {
    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(solution(answer)));
    }

    static int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if(person1[i % person1.length] == answers[i]) {
                score[0]++;
            }

            if(person2[i % person2.length] == answers[i]) {
                score[1]++;
            }

            if(person3[i % person3.length] == answers[i]) {
                score[2]++;
            }
        }

        int maxScore = Math.max(Math.max(score[0], score[1]), score[2]);

        ArrayList<Integer> arr = new ArrayList<>();

        if(maxScore == score[0]) {
            arr.add(1);
        }

        if (maxScore == score[1]) {
            arr.add(2);
        }

        if (maxScore == score[2]) {
            arr.add(3);
        }

        answer = new int[arr.size()];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
