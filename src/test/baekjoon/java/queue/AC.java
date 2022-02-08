package test.baekjoon.java.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class AC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while(T-- != 0) {
            String function = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String[] items = br.readLine().replaceAll("[\\[\\]]", "").split(",");
            LinkedList<Integer> nums = new LinkedList<>();
            for(String item : items) {
                if(!item.equals("")) {
                    nums.add(Integer.parseInt(item));
                }
            }

            boolean isError = false;
            int rev = 0;
            for(int j = 0; j < function.length(); j++) {
                char p = function.charAt(j);
                if(p == 'R') {
                    rev++;
                    continue;
                } else if(p == 'D' && !nums.isEmpty()) {
                    if(rev % 2 == 0) {
                        nums.pollFirst();
                    } else {
                        nums.pollLast();
                    }
                } else {
                    sb.append("error").append("\n");
                    isError = true;
                    break;
                }
            }

            if(isError) {
                continue;
            } else {
                if(!nums.isEmpty()) {
                    if(rev % 2 == 1) {
                        Collections.reverse(nums);
                    }
                    sb.append("[").append(nums.pollFirst());
                    while(!nums.isEmpty()) {
                        sb.append(',').append(nums.pollFirst());
                    }
                    sb.append(']').append('\n');
                } else {
                    sb.append("[]").append('\n');
                }
            }

        }
        System.out.println(sb);
    }
}
