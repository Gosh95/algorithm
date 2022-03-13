package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Sensor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        List<Integer> sensors = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        if(N < K) {
            System.out.println(0);
            System.exit(0);
        }

        for(int i = 0; i < N; i++) {
            sensors.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(sensors, Collections.reverseOrder());

        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < N - 1; i++) {
            temp.add(sensors.get(i) - sensors.get(i + 1));
        }

        Collections.sort(temp, Collections.reverseOrder());

        int result = 0;
        for(int i = K - 1; i < temp.size(); i++) {
            result += temp.get(i);
        }

        System.out.println(result);
    }
}
