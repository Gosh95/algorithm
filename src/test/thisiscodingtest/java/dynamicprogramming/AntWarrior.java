package test.thisiscodingtest.java.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntWarrior {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] d = new int[101];
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < N; i++) {
            d[i] = Math.max(arr[i] + d[i - 2], d[i - 1]);
        }

        System.out.println(d[N - 1]);
    }
}
