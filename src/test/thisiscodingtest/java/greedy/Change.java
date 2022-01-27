package test.thisiscodingtest.java.greedy;

import java.io.*;

public class Change {
    public static void main(String[] args) throws IOException {
        int[] money = new int[]{500, 100, 50, 10};
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.valueOf(br.readLine());

        for(Integer i : money) {
            answer += N / i;
            N = N % i;
        }

        System.out.println(answer);
    }
}
