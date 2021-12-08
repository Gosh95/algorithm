package test.programmers.level2;

public class CreateJadenCaseString {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }

    static String solution(String s) {
        String answer = "";
        int idx = 0;
        String[] str = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length; i++) {
            if(idx == 0) {
                sb.append(str[i].toUpperCase());
            } else {
                sb.append(str[i].toLowerCase());
            }
            idx++;

            if(str[i].equals(" ")) {
                idx = 0;
            }
        }

        answer = sb.toString();

        return answer;
    }
}
