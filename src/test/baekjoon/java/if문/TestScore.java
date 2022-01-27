package test.baekjoon.java.if문;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if(input >= 90 && input <= 100) {
            System.out.println("A");
        } else if(input >= 80 && input <= 89) {
            System.out.println("B");
        } else if (input >= 70 && input <= 79) {
            System.out.println("C");
        } else if(input >= 60 && input <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
