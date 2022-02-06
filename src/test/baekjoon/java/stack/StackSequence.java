package test.baekjoon.java.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> stack = new ArrayList<>();
        List<String> symbol = new ArrayList<>();
        int idx = 1;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            while(idx <= num) {
                stack.add(idx);
                idx++;
                symbol.add("+");
            }

            if(stack.get(stack.size() - 1) == num) {
                stack.remove(stack.size() - 1);
                symbol.add("-");
            } else {
                break;
            }
        }

        if(stack.size() == 0) {
            symbol.stream().forEach(System.out::println);
        } else {
            System.out.println("NO");
        }
    }
}
