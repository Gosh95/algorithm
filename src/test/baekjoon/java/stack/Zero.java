package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int[] nums = new int[K];
        int idx = 0;

        for(int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num != 0) {
                nums[idx++] = num;
            } else {
                nums[--idx] = 0;
            }
        }

        System.out.println(Arrays.stream(nums).sum());
    }
}
