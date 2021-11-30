package test.programmers.level1;

import java.util.Locale;

public class NumberOfPAndYInStrings {
    public static void main(String[] args) {
        System.out.println(solution("Pyy"));
    }

    static boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        String str = s.toLowerCase(Locale.ROOT);
        

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'p') count++;
            if(ch == 'y') count--;
        }

        return answer = count == 0 ? true : false;
    }
}
