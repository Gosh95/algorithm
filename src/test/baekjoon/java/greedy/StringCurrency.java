package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StringCurrency {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        if (N > X || (N * 26) < X) {
            System.out.println("!");
        } else {
            char[] answer = new char[N];
            Arrays.fill(answer, 'A');

            X -= N;
            int idx = N - 1;

            while (X > 0) {
                if (X >= 25) {
                    answer[idx--] = 'Z';
                    X -= 25;
                } else {
                    answer[idx] = (char) (X + 65);
                    break;
                }
            }

            System.out.println(Stream.of(answer).map(String::valueOf).collect(joining()));
        }
    }
}
