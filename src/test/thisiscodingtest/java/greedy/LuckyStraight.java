package test.thisiscodingtest.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LuckyStraight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int idx = nums.length / 2;
        int left = 0, right = 0;
        for(int i : nums) {
            idx--;
            if(idx < 0) {
                right += i;
            } else {
                left += i;
            }
        }

        if(left == right) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
