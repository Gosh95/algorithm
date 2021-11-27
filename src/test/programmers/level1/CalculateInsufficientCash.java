package test.programmers.level1;

public class CalculateInsufficientCash {
    public static void main(String[] args) {

    }

    long solution(int price, int money, int count) {
        long answer = -1;
        long amount = 0;

        for(int i = 1; i <= count; i++) {
            amount += price * i;
        }

        answer = amount > money ? amount - money : 0;

        return answer;
    }
}
