package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] card1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            card1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] card2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            card2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card1);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            if(binarySearch(card1, 0, card1.length - 1, card2[i])) {
                sb.append(1).append(" ");
                continue;
            }

            sb.append(0).append(" ");
        }

        System.out.println(sb);
    }

    static boolean binarySearch(int[] arr, int start, int end, int target) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            }
        }

        return false;
    }
}
