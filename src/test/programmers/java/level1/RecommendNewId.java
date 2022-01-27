package test.programmers.java.level1;

import java.util.Locale;

public class RecommendNewId {
    public static void main(String[] args) {
        System.out.println(RecommendNewId.solution("...!@BaT#*..y.abcdefghijklm"));
    }

    static String solution(String new_id) {
        //1단계 소문자 변환
        new_id = new_id.toLowerCase(Locale.ROOT);

        String answer = "";

        //2단계 new_id 에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        for(int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);

            if(ch >= 'a' && ch <= 'z') { // a - z
                answer += ch;
            } else if(ch - '0' >= 0 && ch - '0' <= 9) {  // 0 - 9
                answer += ch;
            } else if((ch == '-') || (ch == '.') || (ch == '_')) { // -, _, .
                answer += ch;
            } else { // 그 외는 그냥 건너뛴다.
                continue;
            }
        }

        // answer 에 . 이 있을 경우 반복문을 돌려 다음 문자열에도 . 이 이어지는지 확인
        // . 이 이어진다면 dot 변수에 . 을 더해서 replace 해준다.
        for(int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            String dot = ".";

            if(ch == '.') {
                for(int j = i + 1; j < answer.length(); j++) {
                    char temp = answer.charAt(j);

                    if(temp == '.') {
                        dot += ".";
                    } else {
                        break;
                    }
                }

                answer = answer.replace(dot, ".");
            }
        }

        // . 으로 시작하면 substring 으로 첫 문자를 날려준다.
        if(answer.startsWith(".")) {
            answer = answer.substring(1, answer.length());
        }

        // 빈 문자열일 경우 a 추가
        if(answer.length() == 0) {
            answer += "a";
        }

        // 16자 이상일 경우 substring 으로 15자 까지 잘라준다.
        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }

        // 끝이 . 로 끝날 경우 substring 으로 잘라준다.
        if(answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }

        // 길이가 2 이하일 경우 마지막 문자를 길이가 3 될 때까지 추가해준다.
        if(answer.length() <= 2) {
            char ch = answer.charAt(answer.length() - 1);
            while(answer.length() != 3) {
                answer += ch;
            }
        }

        return answer;
    }
}
