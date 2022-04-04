package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Stock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Stack<Integer> prices = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++) {
                prices.push(Integer.parseInt(st.nextToken()));
            }

            long answer = 0;
            while(!prices.isEmpty()) {
                int price = prices.pop();
                for(int i = prices.size() - 1; i > -1; i--) {
                    if(price >= prices.get(i)) {
                        answer += (price - prices.pop());
                    } else {
                        break;
                    }
                }
            }

            System.out.println(answer);
        }
    }
}