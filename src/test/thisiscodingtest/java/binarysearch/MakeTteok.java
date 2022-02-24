package test.thisiscodingtest.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MakeTteok {
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] tteok = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            tteok[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tteok);

        int start = 0;
        int end = tteok[N - 1];

        System.out.println(binarySearch(tteok, start, end));
    }

    static int binarySearch(int[] arr, int start, int end) {
        int answer = 0;
        while(start <= end) {
            int mid = (start + end) / 2;
            int total = 0;
            for(int i = 0; i < N; i++) {
                if(arr[i] >= mid) {
                    total += arr[i] - mid;
                }
            }

            if(total >= M) {
                start = mid + 1;
                answer = mid;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }
}
