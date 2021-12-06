package test.programmers.level1;

public class ColatzGuessing {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
    static int solution(int num) {
        int answer = 0;

        long number = num;

        for(; answer < 500; answer++) {
            if(number == 1) return answer;

            number = (number % 2 == 0) ? number / 2 : (number * 3) + 1;
        }

        return -1;
    }
}
