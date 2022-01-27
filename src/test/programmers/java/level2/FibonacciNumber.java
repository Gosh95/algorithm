package test.programmers.java.level2;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    static int solution(int n) {
        int answer = 0;

        int ppnum = 1;
        int pnum = 1;
        int divisor = 1234567;

        if(n == 2) return 1;

        for(int i = 3; i <= n; i++) {
            answer = (ppnum + pnum) % divisor;
            ppnum = pnum;
            pnum = answer;
        }

        return answer;
    }
}
