package test.programmers.level1;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(solution(987));
    }

    static int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);

        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';

            answer += num;
        }

        return answer;
    }
}
