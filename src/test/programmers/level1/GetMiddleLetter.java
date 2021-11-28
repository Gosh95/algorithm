package test.programmers.level1;

public class GetMiddleLetter {
    public static void main(String[] args) {
        System.out.println(solution("qwee"));
    }

    static String solution(String s) {
        String answer = "";

        int length = s.length();

        answer = length % 2 == 1 ? s.substring(length / 2, length / 2 + 1) : s.substring(length / 2 - 1, length/ 2 + 1);

        return answer;
    }
}
