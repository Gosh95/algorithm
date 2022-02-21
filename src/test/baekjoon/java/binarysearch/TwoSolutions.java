package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoSolutions {
    static int[] answer = new int[2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] solutions = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(solutions);

        int start = 0;
        int end = N - 1;
        long maxValue = Long.MAX_VALUE;

        binarySearch(solutions, start, end, maxValue);

        System.out.println(answer[0] + " " + answer[1]);

    }

    static void binarySearch(int[] arr, int start, int end, long maxValue) {
        while(start < end) {
            int total = arr[start] + arr[end];
            if(Math.abs(total) < maxValue) {
                maxValue = Math.abs(total);
                answer[0] = arr[start];
                answer[1] = arr[end];

                if(total == 0) {
                    break;
                }
            }

            if(total < 0) {
                start++;
            } else {
                end--;
            }
        }
    }
}
