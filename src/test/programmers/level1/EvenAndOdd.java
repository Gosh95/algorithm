package test.programmers.level1;

public class EvenAndOdd {
    String solution(int num) {
        String answer = "";

        answer = num % 2 == 0 ? "Even" : "Odd";

        return answer;
    }
}
