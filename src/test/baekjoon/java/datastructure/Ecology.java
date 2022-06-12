package test.baekjoon.java.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.text.MessageFormat.format;
import static java.util.stream.Collectors.toList;

public class Ecology {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            String tree = br.readLine();

            if (tree == null) break;

            map.put(tree, map.getOrDefault(tree, 0) + 1);
        }

        List<String> keys = map.keySet().stream().sorted().collect(toList());
        double totalCount = map.values().stream().mapToInt(i -> i).sum();

        for (String k : keys) {
            String value = String.format("%.4f", map.get(k) / totalCount * 100);

            System.out.println(format("{0} {1}", k, value));
        }
    }
}
