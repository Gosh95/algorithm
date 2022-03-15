package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        int Z = (int)((Y * 100) / X);

        if(Z >= 99) {
            System.out.println(-1);
            System.exit(0);
        }

        long start = 1;
        long end = X;
        long answer = 0;
        while(start <= end) {
            long mid = (start + end) / 2;
            if(((Y + mid) * 100) / (X + mid) <= Z) {
                start = mid + 1;
            } else {
                answer = mid;
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
