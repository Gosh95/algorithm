package test.thisiscodingtest.java.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyOrAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = Arrays.stream(br.readLine().split(""))
                            .mapToInt(Integer::parseInt)
                            .sorted()
                            .boxed()
                            .collect(Collectors.toList());

        while(nums.size() >= 2) {
            int a = nums.remove(0);
            int b = nums.remove(0);
            if(a <= 1 || b <= 1) {
                nums.add(a + b);
            } else {
                nums.add(a * b);
            }
        }

        System.out.println(nums.get(0));
    }
}
