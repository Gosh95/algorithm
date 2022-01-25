package test.thisiscodingtest.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpDownLeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] plans = br.readLine().split(" ");

        int x = 1; //row
        int y = 1; //column

        int[] posX = new int[]{-1, 1, 0, 0}; //U D L R
        int[] posY = new int[]{0, 0, -1, 1}; //U D L R
        String[] direction = new String[]{"U", "D", "L", "R"};

        for(String i : plans) {
            int tempX = -1, tempY = -1;

            for(int j = 0; j < direction.length; j++) {
                if(i.equals(direction[j])) {
                    tempX = x + posX[j];
                    tempY = y += posY[j];

                    break;
                }
            }

            if(tempX < 1 || tempY < 1 || tempX > N || tempY > N) {
                continue;
            }

            x = tempX;
            y = tempY;
        }

        System.out.println(x + " " + y);
    }
}
