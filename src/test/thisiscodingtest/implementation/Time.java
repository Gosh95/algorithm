package test.thisiscodingtest.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        int hour = N;
        int minute = 60, second = 60;

        for(int i = 0; i <= hour; i++) {
            for(int j = 0; j < minute; j++) {
                for(int k = 0; k < second; k++) {
                    String time = String.valueOf(i) + j + k;
                    if(time.contains("3")) answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
