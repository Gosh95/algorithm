package test.baekjoon.java.if문;

import java.util.Scanner;

public class PickAQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x > 0) {
            if(y > 0) System.out.println(1);
            if(y < 0) System.out.println(4);
        }

        if(x < 0) {
            if(y > 0) System.out.println(2);
            if(y < 0) System.out.println(3);
        }
    }
}
