package test.baekjoon.java.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SumOfTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int x = Integer.parseInt(br.readLine());

        int left = 0, right = n - 1, answer = 0;
        while (left < right) {
            int sumOfNumber = nums[left] + nums[right];

            if (sumOfNumber == x) {
                answer++;
                left++;
            } else if (sumOfNumber > x) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(answer);
    }
}