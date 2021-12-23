package test.programmers.level2;

public class MakeMaximum {
    public static void main(String[] args) {
        System.out.println(solution("1924", 2));
    }

    static public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int max = 0;

        for(int i = 0; i < number.length() - k; i++) {
            max = 0;

            for(int j = idx; j <= i + k; j++) {
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    idx = j + 1;
                }
            }

            sb.append(max);
        }

        answer = sb.toString();

        return answer;
    }
}
