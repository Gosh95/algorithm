package test.programmers.level1;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(solution("a b c", 1));
    }

    static String solution(String s, int n) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int size = 'z' - 'a' + 1;

            if(Character.isLowerCase(ch)) {
                answer += (char)(ch + n > 'z' ? ch + (n - size) : ch + n);
            } else if(Character.isUpperCase(ch)) {
                answer += (char)(ch + n > 'Z' ? ch + (n - size) : ch + n);
            } else {
                answer += ch;
            }
        }

        return answer;
    }
}
