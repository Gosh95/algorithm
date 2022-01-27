package test.programmers.java.level1;

public class FindKimInSeoul {
    public static void main(String[] args) {
        String[] ar = {"Jane", "Kim"};

        System.out.println(solution(ar));
    }

    static String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equalsIgnoreCase("kim")) {
                answer = "김서방은 " +  i + "에 있다";
                break;
            }
        }

        return answer;
    }
}
