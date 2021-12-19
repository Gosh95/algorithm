package test.programmers.level2;


import java.util.Arrays;

public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {5, 4, 3, 3, 4};
        System.out.println(Arrays.toString(solution(prices)));
    }

    static public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                answer[i]++;

                if(prices[i] > prices[j])
                    break;
            }
        }

        return answer;
    }
}
