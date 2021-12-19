package test.programmers.level2;


import java.util.Arrays;
import java.util.Stack;

public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {5, 4, 3, 3, 4};
        System.out.println(Arrays.toString(solutionStack(prices)));
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

    //스택 풀이 과정.
    //https://girawhale.tistory.com/7
    static public int[] solutionStack(int[] prices) {
        int[] ans = new int[prices.length];
        Stack<Integer> stack = new Stack();

        for(int i = 0; i < prices.length; i++) {
            //스택이 비어있거나 가격이 떨어지지 않는다면 계속 인덱스(시간) 를 추가해준다.
            //스택이 비어있지 않으면서 가격이 떨어진다면 배열에 현재 인덱스 - 스택 인덱스를 빼주고 스택 요소를 날려준다.
            //이렇게 하면 가격이 떨어질 경우 배열 세팅 완료
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                ans[stack.peek()] = i - stack.peek();
                stack.pop(); //스택에 들어있는 요소를 제거해준다.
            }

            stack.push(i);
        }

        //가격이 떨이지지 않은 요소 처리
        while(!stack.isEmpty()) {
            ans[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return ans;
    }
}
