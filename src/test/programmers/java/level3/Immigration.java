package test.programmers.java.level3;

import java.util.Arrays;

public class Immigration {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long start = 1;
        long end = (long) n * times[times.length - 1];
        while(start <= end) {
            long mid = (start + end) / 2;
            long total = 0;
            for(int t : times) {
                total += mid / t;
            }
            if(total >= n) {
                end = mid - 1;
                answer = mid;
            } else {
                start = mid + 1;
            }
        }

        return answer;
    }
}