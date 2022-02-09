package test.baekjoon.java.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CutTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        int N = Integer.parseInt(values[0]);
        int M = Integer.parseInt(values[1]);
        int[] trees = Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.parseInt(i)).toArray();
        int start = 1;
        int end = 0;
        for(int tree : trees) {
            if(end < tree) {
                end = tree;
            }
        }

        while(start <= end) {
            long m_tree = 0;
            int mid = (start + end) / 2;
            for(int tree : trees) {
                if(tree >= mid) {
                    m_tree += tree - mid;
                }
            }
            if(m_tree >= M) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(end);
    }
}
