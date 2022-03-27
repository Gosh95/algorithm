package test.thisiscodingtest.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdventurerGuild {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] fears = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            fears[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0, answer = 0;
        for(int f : fears) {
            count++;
            if(count >= f) {
                answer++;
                count = 0;
            }
        }

        System.out.println(answer);
    }
}
