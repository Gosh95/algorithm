package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] buttons = new int[]{300, 60, 10};
        for(int i = 0; i < buttons.length; i++) {
            if(i != 0) {
                sb.append(' ');
            }
            if(T < buttons[i]) {
                sb.append(0);
                continue;
            } else {
                sb.append(T / buttons[i]);
                T %= buttons[i];
            }
        }

        if(T == 0) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
