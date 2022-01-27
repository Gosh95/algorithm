package test.programmers.java.level1;

import java.time.LocalDate;

public class TwentySixteenYear {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }

    static String solution(int a, int b) {
        String answer = "";

        LocalDate day = LocalDate.of(2016, a, b);

        answer = day.getDayOfWeek().toString().substring(0, 3);
        return answer;
    }
}
