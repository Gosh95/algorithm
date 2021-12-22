package test.programmers.level2;

import java.util.Arrays;

public class TwoOrLessDifferentBit {
    public static void main(String[] args) {
        long[] arr = {2, 7};

        System.out.println(Arrays.toString(solution(arr)));
    }

    static public long[] solution(long[] numbers) {
        //해당 문제는 다음과 같은 패턴이 존재한다. https://wellbell.tistory.com/202
        //짝수일 때는 뒤에는 무조건 0으로 끝나므로 + 1만 해주면 비트 차이가 2개 이상 나지 않는 다음 큰 숫자를 구할 수 있다.
        //홀수일 떄는 111과 같이 0이 없을 경우는 맨 앞에 1을 붙여 1111 을 만들고 두번째 자리를 0으로 바꿔주면 된다.
        //0을 포함할 때는 맨 마지막 자리의 0을 1로 바꾸고 그 다음 숫자가 1일 경우 0으로 바꿔주면 된다.
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                //짝수라면 맨 마지막이 0이기 때문에 + 1 만 해주면 된다.
                answer[i] = numbers[i] + 1;
            } else {
                StringBuilder sb = new StringBuilder();
                String binaryStr = Long.toBinaryString(numbers[i]);

                if(!binaryStr.contains("0")) {
                    sb.append("10");
                    sb.append(binaryStr.substring(1));
                } else {
                    int lastIdx = binaryStr.lastIndexOf("0");
                    //마지막 0의 위치
                    int nextOneIdx = binaryStr.indexOf("1", lastIdx);
                    //0 다음 1의 위치

                    sb.append(binaryStr, 0, lastIdx).append("1");
                    //마지막 0 전까지 append 그리고 0자리를 1로 append

                    sb.append("0").append(binaryStr.substring(nextOneIdx + 1));
                }

                answer[i] = Long.parseLong(sb.toString(), 2);
            }
        }

        return answer;
    }
}
