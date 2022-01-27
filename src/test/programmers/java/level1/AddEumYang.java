package test.programmers.java.level1;

public class AddEumYang {
    public static void main(String[] args) {
        int[] arr = {4,7,12};
        boolean[] b = {true, false, true};
        System.out.println(solution(arr, b));
    }

    static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            absolutes[i] *= signs[i] ? 1 : -1;
            answer += absolutes[i];
        }

        return answer;
    }
}
