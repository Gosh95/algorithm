package test.programmers.java.level1;

import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();

        sb.append("*".repeat(a));

        for(int i = 0; i < b; i++) {
            System.out.println(sb.toString());
        }

      /* 다른사람 코드 : 스트림 사용해서도 가능
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
        */

    }
}
