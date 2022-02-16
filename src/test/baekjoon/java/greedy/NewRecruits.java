package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NewRecruits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> rankings;
        int T = Integer.parseInt(br.readLine());


        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            rankings = new HashMap<>();

            for(int j = 0; j < N; j++) {
                int[] items = Arrays.stream(br.readLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
                rankings.put(items[0], rankings.getOrDefault(items[0], 0) + items[1]);
            }

            int idx = 1;
            int count = 1;
            for(int k = 2; k < N + 1; k++) {
                if(rankings.get(idx) > rankings.get(k)) {
                    count += 1;
                    idx = k;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
