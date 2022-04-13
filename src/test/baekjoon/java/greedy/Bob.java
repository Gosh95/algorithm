package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Menu {
    int A;
    int B;
    int diff;

    public Menu(int A, int B, int diff) {
        this.A = A;
        this.B = B;
        this.diff = diff;
    }
}

public class Bob {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int answer = 0;
        List<Menu> menus = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            answer += B;

            menus.add(new Menu(A, B, Math.abs(A - B)));
        }

        menus.sort((m1, m2) -> m2.diff - m1.diff);

        X -= (N * 1000);

        for(Menu m : menus) {
            if(m.A > m.B) {
                X -= 4000;
                if(X < 0) {
                    break;
                }
                answer += -m.B + m.A;
            }
        }

        System.out.println(answer);
    }
}
