package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Immigration {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        int[] T = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++) {
            T[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, T[i]);
        }

        long start = 1;
        long end = max * M;
        long answer = 0;
        while(start <= end) {
            long mid = (start + end) / 2;
            long total = 0;

            for(int t : T) {
                total += mid / t;
            }

            if(total >= M) {
                end = mid - 1;
                answer = mid;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
