package test.programmers.level2;

public class ExpressionOfNumber {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    static int solution(int n) {
        int answer = 0;
        int temp;

        for(int i = 1; i <= n; i++) {
            temp = 0;

            for(int j = i; j <= n; j++) {
                temp += j;

                if(temp == n) {
                    answer++;
                    break;
                } else if(temp > n){
                    break;
                }
            }
        }

        return answer;
    }
}
