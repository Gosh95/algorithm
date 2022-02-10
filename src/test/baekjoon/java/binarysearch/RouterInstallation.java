package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RouterInstallation {
    static int[] homes;
    static int C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int N = Integer.parseInt(values[0]);
        C = Integer.parseInt(values[1]);

        homes = new int[N];
        for(int i = 0; i < N; i++) {
            homes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(homes);

        int start = 1;
        int end = homes[N - 1] - start;

        System.out.println(binarySearch(start, end));

    }
    static private int binarySearch(int start, int end) {
        while(start <= end) {
            int count = 1;
            int mid = (start + end) / 2;
            int lastLocate = homes[0];

            for(int home : homes) {
                if(lastLocate + mid <= home) {
                    lastLocate = home;
                    count++;
                }
            }

            if(count >= C) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}
