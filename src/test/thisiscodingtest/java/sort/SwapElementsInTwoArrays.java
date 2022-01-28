package test.thisiscodingtest.java.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SwapElementsInTwoArrays {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Integer[] arrA = new Integer[N];
        for(int i = 0; i < N; i++) {
            arrA[i] = scanner.nextInt();
        }

        Integer[] arrB = new Integer[N];
        for(int i = 0; i < N; i++) {
            arrB[i] = scanner.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB, Collections.reverseOrder());

        for(int i = 0; i < K; i++) {
            if(arrA[i] < arrB[i]) {
                int temp = arrA[i];
                arrA[i] = arrB[i];
                arrB[i] = temp;
            } else {
                break;
            }
        }

        System.out.println(Arrays.stream(arrA).mapToInt(a -> a.intValue()).sum());
    }
}
