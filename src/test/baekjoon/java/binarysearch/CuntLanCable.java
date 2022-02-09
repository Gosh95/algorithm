package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CuntLanCable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int K = Integer.parseInt(values[0]);
        int N = Integer.parseInt(values[1]);
        int[] cables = new int[K];
        for(int i = 0; i < K; i++) {
            cables[i] = Integer.parseInt(br.readLine());
        }
        long start = 1;
        long end = Arrays.stream(cables).max().getAsInt();

        while(start <= end) {
            long count = 0;
            long mid = (start + end) / 2;
            for(int cable : cables) {
                count += cable / mid;
            }
            if(count >= N) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
