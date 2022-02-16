package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Thirty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        makeThirty(N);
    }
    static private void makeThirty(String num) {
        StringBuilder sb = new StringBuilder();
        char[] chars = num.toCharArray();
        Arrays.sort(chars);
        int sum = 0;
        for(int i = chars.length - 1; i > -1; i--) {
            sb.append(chars[i]);
            sum += chars[i] - '0';
        }

        if(!num.contains("0") || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(sb);
        }
    }
}
