package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordMath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for(int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String word = words[i];
            for(int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + (int)Math.pow(10, word.length() - 1 - j));
            }
        }

        int[] values = map.values().stream().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

        long answer = 0;
        for(int i = 0, num = 9; i < values.length; i++, num--) {
            answer += values[i] * num;
        }

        System.out.println(answer);
    }
}
