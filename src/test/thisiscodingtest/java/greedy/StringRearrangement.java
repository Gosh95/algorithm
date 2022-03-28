package test.thisiscodingtest.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringRearrangement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        List<String> word = Arrays.stream(br.readLine().split("")).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        }).collect(Collectors.toList());

        while(word.get(0).charAt(0) - '0' >= 0 && word.get(0).charAt(0) - '0' <= 9) {
            num += Integer.parseInt(word.remove(0));
        }
        word.add(String.valueOf(num));

        StringBuilder sb = new StringBuilder();
        for(String w : word) {
            sb.append(w);
        }

        System.out.println(sb.toString());
    }
}
