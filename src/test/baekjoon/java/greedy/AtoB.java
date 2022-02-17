package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtoB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] items = br.readLine().split(" ");
        String a = items[0];
        String b = items[1];

        int answer = 1;
        while(Integer.parseInt(a) < Integer.parseInt(b)) {
            if(b.charAt(b.length() - 1) == '1') {
                b = b.substring(0, b.length() - 1);
                answer++;
            } else if(Integer.parseInt(b) % 2 == 0){
                b = String.valueOf(Integer.parseInt(b) / 2);
                answer++;
            } else {
                break;
            }
        }

        if(a.equals(b)) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
