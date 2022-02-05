package test.baekjoon.java.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DirectorSyom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int titles = 666;
        int count = 1;

        while(count != N) {
            titles++;

            if(String.valueOf(titles).contains("666")) {
                count++;
            }
        }

        System.out.println(titles);
    }
}
