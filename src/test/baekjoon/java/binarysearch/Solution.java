package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] solutions = new int[N];

        for (int i = 0; i < N; i++) {
            solutions[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N - 1;
        long maxValue = Long.MAX_VALUE;
        int answerLeft = 0;
        int answerRight = 0;
        while (left < right) {
            long solutionSum = solutions[left] + solutions[right];

            if (abs(solutionSum) < maxValue) {
                maxValue = abs(solutionSum);
                answerLeft = solutions[left];
                answerRight = solutions[right];
            }

            if(solutionSum > 0) {
                right--;
            } else if(solutionSum < 0) {
                left++;
            } else {
                break;
            }
        }

        System.out.println(answerLeft + " " + answerRight);
    }
}
