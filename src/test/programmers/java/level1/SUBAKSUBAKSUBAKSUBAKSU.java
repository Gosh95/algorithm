package test.programmers.java.level1;

public class SUBAKSUBAKSUBAKSUBAKSU {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }
    static String solution(int n) {
        String answer = "";
        String subak = "수박";

        int a = n / 2; //몫
        int b = n % 2; //나머지

        answer = subak.repeat(a);

        if(b > 0) { //홀수이면 무조건 뒤에 수로 끝나기 때문에 수를 붙여준다
            answer += subak.charAt(0);
        }

        return answer;
    }
}
