package test.baekjoon.java.if문;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();

        if(M < 45) {
            M = 60 - (45 - M);
            H -= 1;

            if(H < 0) {
                H = 23;
            }

            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
