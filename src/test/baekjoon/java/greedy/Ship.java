package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> cranes = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            cranes.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        List<Integer> boxes = new ArrayList<>();
        for(int i = 0; i < M; i++) {
            boxes.add(Integer.parseInt(st.nextToken()));
        }

        cranes.sort(Comparator.reverseOrder());
        boxes.sort(Comparator.reverseOrder());

        if(boxes.get(0) > cranes.get(0)) {
            System.out.println("-1");
        } else {
            int answer = 0;
            while(!boxes.isEmpty()) {
                int index = 0;
                for(int i = 0; i < cranes.size();) {
                    if(index == boxes.size()) {
                        break;
                    } else if(cranes.get(i) >= boxes.get(index)) {
                        boxes.remove(index);
                        i++;
                    } else {
                        index++;
                    }
                }

                answer++;
            }

            System.out.println(answer);
        }
    }
}