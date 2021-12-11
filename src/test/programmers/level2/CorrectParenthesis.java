package test.programmers.level2;

import java.util.Stack;

public class CorrectParenthesis {
    public static void main(String[] args) {
        System.out.println(solution(")()("));
    }

    static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') {
                stack.add(ch);
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        if(!(stack.isEmpty())) {
            return false;
        }

        return answer;
    }
}
