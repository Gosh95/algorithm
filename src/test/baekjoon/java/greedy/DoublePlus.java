package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DoublePlus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] zero_arr = new int[N];
        Arrays.fill(zero_arr, 0);

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 0;

        while (!Arrays.equals(arr, zero_arr)) {
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 == 1) {
                    arr[i] -= 1;
                    answer += 1;
                }
            }

            if (Arrays.equals(arr, zero_arr)) {
                break;
            }

            for (int j = 0; j < N; j++) {
                arr[j] /= 2;
            }

            answer += 1;
        }

        System.out.println(answer);
    }
}
