package test.baekjoon.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Time {
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class ClassroomAssignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Time> times = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            times.add(new Time(start, end));
        }

        times.sort(Comparator.comparingInt(o -> o.start));

        PriorityQueue<Integer> answer = new PriorityQueue<>();
        answer.add(times.get(0).end);

        for (int i = 1; i < N; i++) {
            if (times.get(i).start >= answer.peek()) {
                answer.poll();
            }

            answer.add(times.get(i).end);
        }

        System.out.println(answer.size());
    }
}
