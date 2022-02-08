package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] n_cards = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();
        int M = Integer.parseInt(br.readLine());
        int[] m_cards = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            map.put(n_cards[i], map.getOrDefault(n_cards[i], 0) + 1);
        }

        for(int i = 0; i < M; i++) {
            sb.append(map.getOrDefault(m_cards[i], 0)).append(' ');
        }

        System.out.println(sb);
    }
}
