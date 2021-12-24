package test.programmers.level2;

import java.util.Stack;

public class ParenthesisRotation {
    public static void main(String[] args) {
        System.out.println(solution("[)(]"));
    }

    static public int solution(String s) {
        int answer = 0;
        int index = s.length();

        for(int i = 0; i < index; i++) {
            Stack<String> stack = new Stack<>();

            for(int j = 0; j < index; j++) {
                String str = String.valueOf(s.charAt(j));

                if(stack.isEmpty()) {
                    stack.push(str);

                    continue;
                }

                if(stack.peek().equals("(") && str.equals(")")) {
                    stack.pop();
                } else if(stack.peek().equals("[") && str.equals("]")) {
                    stack.pop();
                } else if(stack.peek().equals("{") && str.equals("}")) {
                    stack.pop();
                } else {
                    stack.push(str);
                }
            }

            if(stack.isEmpty()) answer++;

            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }
}
