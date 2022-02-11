package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LostBracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] items = br.readLine().split("\\-");
        int result = 0;
        result += Arrays.stream(items[0].split("\\+")).mapToInt(i -> Integer.parseInt(i)).sum();

        for(int i = 1; i < items.length; i++) {
            result -= Arrays.stream(items[i].split("\\+")).mapToInt(j -> Integer.parseInt(j)).sum();
        }

        System.out.println(result);
    }
}
