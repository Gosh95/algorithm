package test.programmers.java.level2;

import java.util.Stack;

public class PairToRemove {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        String[] str = s.split("");

        for(int i = 0; i < str.length; i++) {
            if(stack.isEmpty()) {
                stack.push(str[i]);
            } else {
                if(stack.peek().equals(str[i])) {
                    stack.pop();
                } else {
                    stack.push(str[i]);
                }
            }
        }

        if(!stack.isEmpty()) {
            return 0;
        }

        return 1;
    }
}