package test.thisiscodingtest.java.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class FromUpToDown {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        arr.sort(Collections.reverseOrder());

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
