package test.baekjoon.java.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = N;
        for(int i = 0; i < N; i++) {
            boolean[] check = new boolean[26];
            String word = br.readLine();
            for(int j = 0; j < word.length(); j++) {
                int alphabetIdx = word.charAt(j) - 'a';
                if(check[alphabetIdx] && j > 0) {
                    if(word.charAt(j) != word.charAt(j - 1)) {
                        answer--;
                        break;
                    } else {
                        continue;
                    }
                } else {
                    check[alphabetIdx] = true;
                }
            }
        }

        System.out.println(answer);
    }
}
