package test.baekjoon.java.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;

public class ImPocketmonMaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Pattern pattern = Pattern.compile("[0-9]+");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Object, Object> dictionary = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            String name = br.readLine();

            dictionary.put(name, i);
            dictionary.put(i, name);
        }

        List<Object> answer = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String question = br.readLine();

            answer.add(
                pattern.matcher(question).matches() ?
                    dictionary.get(Integer.parseInt(question))
                    : dictionary.get(question)
            );
        }

        answer.forEach(System.out::println);
    }
}
