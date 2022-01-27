package test.programmers.java.level2;

public class NJinsuGame {
    public static void main(String[] args) {
        System.out.println(solution(16, 16, 2, 1));
    }

    static String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i <= t * m; i++) {
            //Integer.toString(x, y) : 숫자 x 를 y 진법으로 바꿔준다.
            temp.append(Integer.toString(i, n));
        }

        StringBuilder sb = new StringBuilder();

        for(int i = p -1; sb.length() < t; i += m) {
            sb.append(temp.charAt(i));
        }

        answer = sb.toString().toUpperCase();

        return answer;
    }
}
