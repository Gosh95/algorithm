package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TieANumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> gtZero = new ArrayList<>();
        List<Integer> ltZero = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int item = Integer.parseInt(br.readLine());
            if(item > 0) {
                gtZero.add(item);
            } else {
                ltZero.add(item);
            }
        }

        Collections.sort(ltZero);
        Collections.sort(gtZero, Collections.reverseOrder());

        int answer = 0;
        int idx = ltZero.size();
        if(ltZero.size() % 2 != 0) {
            answer += ltZero.get(idx - 1);
            idx -= 1;
        }
        for(int i = 0; i < idx; i += 2) {
            answer += (ltZero.get(i) * ltZero.get(i + 1));
        }

        idx = gtZero.size();
        if(gtZero.size() % 2 != 0) {
            answer += gtZero.get(idx - 1);
            idx -= 1;
        }
        for(int i = 0; i < idx; i += 2) {
            if(gtZero.get(i) > 1 && gtZero.get(i + 1) > 1) {
                answer += (gtZero.get(i) * gtZero.get(i + 1));
            } else if(gtZero.get(i) >= 1 || gtZero.get(i + 1) >= 1) {
                answer += (gtZero.get(i) + gtZero.get(i + 1));
            }
        }

        System.out.println(answer);
    }
}
