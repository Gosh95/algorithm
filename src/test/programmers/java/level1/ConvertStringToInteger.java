package test.programmers.java.level1;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }

    static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

/*
        알고리즘
        boolean sign = true;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '-') {
                sign = false;
            } else if(ch != '+') {
                answer = answer * 10 + (ch - '0');
            }
        }

       answer *= sign ? 1 : -1;*/

        return answer;
    }
}
