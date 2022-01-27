package test.programmers.java.level2;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] arr = {3, 0, 6, 1, 5};

        System.out.println(solution(arr));
    }

    static public int solution(int[] citations) {
        //오름차순 정렬 시 배열 값이 배열 길이 - 인덱스 보다 크거나 같은 경우 h-index 가 된다.
        int answer = 0;
        int h_idx;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            h_idx = citations.length - i;

            if(citations[i] >= h_idx) {
                answer = h_idx;
                break;
            }
        }

        return answer;
    }
}
