package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Blog2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String colors = br.readLine();

        Map<Character, Integer> colorMap = new HashMap<>() {
            {
                put('B',0);
                put('R', 0);
            }
        };

        char tempColor = ' ';
        for(int i = 0; i < N; i++) {
            char ch = colors.charAt(i);
            if(ch != tempColor) {
                colorMap.put(ch, colorMap.get(ch) + 1);
            }
            tempColor = ch;
        }

        System.out.println(Math.min(colorMap.get('B'), colorMap.get('R')) + 1);
    }
}