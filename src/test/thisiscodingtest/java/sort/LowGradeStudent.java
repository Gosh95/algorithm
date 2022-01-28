package test.thisiscodingtest.java.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class LowGradeStudent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, String> student = new LinkedHashMap<>();

        for(int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            student.put(Integer.parseInt(s[1]), s[0]);
        }

        List<Integer> scores = student.keySet().stream().sorted().collect(Collectors.toList());

        for(int i = 0; i < scores.size(); i++) {
            System.out.print(student.get(scores.get(i)) + " ");
        }
    }
}
