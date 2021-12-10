package test.programmers.level2;

public class NextBigNumber {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    static int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);

        for(int i = n + 1;;i++) {
            int temp = Integer.bitCount(i);

            if(count == temp) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
