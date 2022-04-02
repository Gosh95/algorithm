package test.baekjoon.java.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Rainwater {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < W; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        for(int i = 1; i < W - 1; i++) {
            Integer leftRight = arr.subList(0, i).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0);
            Integer maxRight = arr.subList(i + 1, W).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(0);

            int min_num = Math.min(leftRight, maxRight);

            if(arr.get(i) < min_num) {
                answer += min_num - arr.get(i);
            }
        }

        System.out.println(answer);
    }
}