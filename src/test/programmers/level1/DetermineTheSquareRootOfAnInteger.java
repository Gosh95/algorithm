package test.programmers.level1;

public class DetermineTheSquareRootOfAnInteger {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    static long solution(long n) {
        long answer = 0;

        Double sqrt = Math.sqrt(n);

        answer = sqrt == (sqrt.intValue()) ? (long) Math.pow(sqrt + 1, 2) : -1;
        //intValue 메소드를 사용해서 결과 값이 정수 값이랑 같은지 비교해서 같으면 true

        return answer;
    }
}
