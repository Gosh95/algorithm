package test.programmers.java.level1;

import java.util.Arrays;

public class FindDecimals {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    static int solution(int n) {
        int answer = 0;

    /*      일반 for 문으로 돌리면 성능 저하로 에러남

            for(int i = 2; i < n; i++) {
            int count = 0;
            int sqrt = (int)Math.sqrt(i);

            for(int j = 1; j < sqrt; j++) {
                if(i % j == 0) count++;
            }

            if(count == 1) answer++;
    }*/

    /*
        에라토스테네스의 체 를 사용해야 한다.
        에라토스테네스의 체 : 자신이 소수라면 자신의 배수는 소수가 아니다.
     */
        //에라토스테네스의 체 0과 1은 문제에서 배제하기 때문에 나머지만 1 로 맞춰준다.
        int arrSize = n + 1;
        int[] arr = new int[arrSize];

        Arrays.fill(arr, 2, arrSize, 1);


        for(int i = 2; i < arrSize; i++) {
            //소수가 아니라면 스킵
            if(arr[i] == 0) continue;

            //j == 1 은 소수, 소수라면 소수의 배수가 되는 숫자는 소수가 아니므로 0으로 바꿔준다.
            for(int j = i * 2; j < arrSize; j += i) {
                arr[j] = 0;
            }
        }

        for(int i = 2; i < arrSize; i++) {
            if(arr[i] != 0) answer++; //0이 아니면 소수
        }

        return answer;
    }
}
