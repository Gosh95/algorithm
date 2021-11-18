package test.programmers.level1;

public class ConvertStringToNumber {
    public static void main(String[] args) {
        System.out.println(ConvertStringToNumber.solution("four23one"));
    }
    static int solution(String s) {
        int answer = 0;
        String num = "";
        String str = "";
        String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven" , "eight", "nine"};

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            str += ch;

            for(int j = 0; j < english.length; j++) {
                if(str.equals(english[j])) {
                    num += j;
                    str = "";
                } else if(ch - '0' >= 0 && ch - '0' <= 9) {
                    num += ch;
                    str = "";
                    break;
                }
            }
        }

        answer = Integer.parseInt(num);

        return answer;
    }
}
