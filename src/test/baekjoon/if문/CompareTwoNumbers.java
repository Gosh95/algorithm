package test.baekjoon.if문;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        if(A > B) {
            System.out.println(">");
        } else if(A < B) {
            System.out.println("<");
        } else if(A == B) {
            System.out.println("==");
        }
    }
}
