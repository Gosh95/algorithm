package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] formula = br.readLine().split("");
        Stack<Double> answer = new Stack<>();
        double[] nums = new double[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (String f : formula) {
            int idx = f.charAt(0) - 'A';

            if (idx >= 0 && idx <= 26) {
                answer.add(nums[idx]);
            } else {
                if (answer.size() >= 2) {
                    double b = answer.pop();
                    double a = answer.pop();

                    answer.push(calc(a, b, f));
                }
            }
        }

        System.out.printf("%.2f", answer.get(0));
    }

    static double calc(double a, double b, String symbol) {
        switch (symbol) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                return a / b;
        }
    }

}
