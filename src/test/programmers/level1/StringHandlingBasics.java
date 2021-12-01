package test.programmers.level1;

public class StringHandlingBasics {
    public static void main(String[] args) {
        System.out.println(solution("123234"));
    }
    static boolean solution(String s) {
        boolean answer = true;

        if(!(s.length() == 4 || s.length() == 6)) return false;

        for(int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - '0';

            if(!(ch >= 0 && ch <= 9)) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
