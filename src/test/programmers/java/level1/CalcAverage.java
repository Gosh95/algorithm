package test.programmers.java.level1;

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
