package test.baekjoon.java.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SevenDwarfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> heights = new ArrayList<>();
        int totalHeight = 0;

        for (int i = 0; i < 9; i++) {
            heights.add(Integer.parseInt(br.readLine()));
            totalHeight += heights.get(i);
        }

        Collections.sort(heights);

        int overHeight =  totalHeight - 100;

        int start = 0;
        int end = 8;

        while (start <= end) {
            int sumHeight = heights.get(start) + heights.get(end);

            if (sumHeight == overHeight) {
                heights.remove(end);
                heights.remove(start);

                break;
            }  else if (sumHeight > overHeight) {
                end -= 1;
            } else {
                start += 1;
            }
        }

        for (int h : heights) {
            System.out.println(h);
        }
    }
}
