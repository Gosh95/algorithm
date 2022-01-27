package test.baekjoon.java.for문;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();

        for(int i = 1; i <= 9; i++) {
            sb.append(n + " * " + i + " = " + n * i).append('\n');
        }

        System.out.println(sb.toString());
    }
}
