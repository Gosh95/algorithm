package test.thisiscodingtest.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindParts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] parts = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            parts[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] find = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            find[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(parts);
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = parts.length - 1;
        for(int i = 0; i < M; i++) {
            int target = find[i];
            sb.append(binarySearch(parts, target, start, end)).append(" ");
        }

        System.out.println(sb);
    }

    static String binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                return "yes";
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return "no";
    }
}
