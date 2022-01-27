package test.programmers.java.level1;

public class SumOfFactors {
    int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) answer += i;
        }

    /*  for 문을 절반만 돌려서 더 효율적으로 운영 가능
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) answer += i;
        }

        return answer + n;
    */

        return answer;
    }
}
