package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoomEscape {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] notes = new int[N];
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            notes[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] != notes[i]) {
                answer++;

                for(int j = i; j < i + 3; j++) {
                    if(j > N - 1) {
                        break;
                    }

                    arr[j] = 1 - arr[j];
                }
            }
        }

        System.out.println(answer);
    }
}
