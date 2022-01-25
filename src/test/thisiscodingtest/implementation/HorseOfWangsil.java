package test.thisiscodingtest.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorseOfWangsil {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split("");
        int answer = 0;

        String[] columns = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        int[][] pos = new int[][]{{1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}};

        int column =(split[0].charAt(0) - 'a') + 1;
//        for(int i = 0; i < columns.length; i++) {
//            if(columns[i].equals(split[0])) {
//                column = i + 1;
//            }
//        }

        int row = Integer.parseInt(split[1]);

        for(int i = 0; i < 8; i++) {
            int tempCol = column;
            int tempRow = row;

            tempRow += pos[i][0];
            tempCol += pos[i][1];

            if(tempRow < 1 || tempCol < 1 || tempRow > 8 || tempCol > 8) continue;

            answer++;
        }

        System.out.println(answer);
    }
}
