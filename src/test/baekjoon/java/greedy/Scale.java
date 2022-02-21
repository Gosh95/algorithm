package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] weights = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            weights[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(weights);

        int answer = 0;
        for(int weight : weights) {
            if(answer + 1 < weight) {
                break;
            }

            answer += weight;
        }

        System.out.println(answer + 1);
    }
}
