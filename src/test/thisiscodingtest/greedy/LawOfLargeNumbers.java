package test.thisiscodingtest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LawOfLargeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String str = br.readLine();
        String[] split = str.split(" ");

        int N = Integer.valueOf(split[0]);
        int M = Integer.valueOf(split[1]);
        int K = Integer.valueOf(split[2]);

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(arr);

        int first = arr[N - 1];
        int second = arr[N - 2];
        int temp = K;

        for(int i = 0; i < M; i++) {
            if(temp != 0) {
                answer += first;
            } else {
                answer += second;
                temp = K;
            }

            temp--;
        }

/*        int count = (M / (K + 1)) * K;
        count += (M % (K + 1));

        answer += first * count;
        answer += (M - count) * second;*/

        System.out.println(answer);
    }
}
