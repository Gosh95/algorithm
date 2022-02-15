package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongestIncreasingSubsequence {
    static Stack<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] subsequence = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            subsequence[i] = Integer.parseInt(st.nextToken());
        }

        result = new Stack<>();
        result.add(0);
        for(int target : subsequence) {
            if(result.peek() < target) {
                result.add(target);
            } else {
                result.set(binarySearch(target, 0, result.size() - 1), target);
            }
        }

        System.out.println(result.size() - 1);
        //0 카운트 제거
    }

    static private int binarySearch(int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if(result.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
