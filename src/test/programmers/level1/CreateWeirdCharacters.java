package test.programmers.level1;

import java.util.Locale;

public class CreateWeirdCharacters {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
    static String solution(String s) {
        String answer = "";
        String[] strings = s.split("");
        int idx = 0;

        for(String str : strings) {
            idx = str.equals(" ") ? 0 : idx + 1;

            answer += idx % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }

        return answer;
    }
}
