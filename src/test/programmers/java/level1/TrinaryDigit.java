package test.programmers.java.level1;

import java.util.ArrayList;

public class TrinaryDigit {
    public static void main(String[] args) {
        System.out.println(solution(125));
    }

    static int solution(int n) {
        int answer = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        while(true) {
            if(n < 3) {
                arr.add(n);
                break;
            }

            int a = n % 3;
            arr.add(a);
            n = n / 3;
        }

        for(int i = 0; i < arr.size(); i++) {
            answer += arr.get(i) * Math.pow(3, arr.size() - 1 - i);
        }

        return answer;
    }
}
