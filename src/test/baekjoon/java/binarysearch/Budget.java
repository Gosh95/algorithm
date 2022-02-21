package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Budget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] requests = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            requests[i] = Integer.parseInt(st.nextToken());
        }
        int maxBudget = Integer.parseInt(br.readLine());

        Arrays.sort(requests);

        int start = 0;
        int end = requests[N - 1];

        if(Arrays.stream(requests).sum() > maxBudget) {
            System.out.println(binarySearch(requests, start, end, maxBudget));
        } else {
            System.out.println(end);
        }
    }

    static int binarySearch(int[] arr, int start, int end, int maxBudget) {
        while(start <= end) {
            int mid = (start + end) / 2;
            int total = 0;
            for(int i : arr) {
                if(i > mid) {
                    total += mid;
                    continue;
                }

                total += i;
            }

            if(total <= maxBudget) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}
