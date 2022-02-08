package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] n_nums = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();
        int M = Integer.parseInt(br.readLine());
        int[] m_nums = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();

        for(int i = 0; i < M; i++) {
            if(binary_search(n_nums, m_nums[i], 0, N - 1)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    static private boolean binary_search(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1;
            }
        }

        return false;
    }
}