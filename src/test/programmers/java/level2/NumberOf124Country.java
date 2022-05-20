package test.programmers.java.level2;

public class NumberOf124Country {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        while (n > 0) {
            if (n % 3 == 0) {
                answer.append("4");
                n = n / 3 - 1;
            } else {
                answer.append(n % 3);
                n /= 3;
            }
        }

        return answer.reverse().toString();
    }
}
