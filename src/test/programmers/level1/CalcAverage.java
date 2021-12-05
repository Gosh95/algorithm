package test.programmers.level1;

import java.awt.print.Pageable;
import java.util.Arrays;

public class CalcAverage {
    public static void main(String[] args) {
    }

    static double solution(int[] arr) {
        double sum = 0;
        double count = arr.length;

        for(int i : arr) {
            sum += i;
        }

        return sum / count;
    }
}
