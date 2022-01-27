package test.programmers.java.level2;

public class NLeastCommonMultiples {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};

        System.out.println(solution(arr));
    }

    static int solution(int[] arr) {
        //풀이는 맞았으나 코드가 난잡해 보여서 마음에 들지 않음

        int answer = 0;
        int gcd = gcd(arr[0], arr[1]); //초기 설정
        int lcm = arr[0] * arr[1] / gcd; //초기 설정

        for(int i = 2; i < arr.length; i++) {
            gcd = gcd(lcm, arr[i]);

            lcm = lcm * arr[i] / gcd;
        }

        answer = lcm;

        return answer;
    }

    static int gcd(int min, int max) {
        if(min > max) {
            int temp = max;
            max = min;
            min = temp;
        }

        while(true) {
            if(max % min == 0) {
                return min;
            } else {
                int temp = max % min;
                max = min;
                min = temp;
            }
        }
    }
}
