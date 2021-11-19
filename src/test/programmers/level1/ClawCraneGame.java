package test.programmers.level1;

import java.util.Stack;

public class ClawCraneGame {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};

        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(matrix, moves));
    }

    static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int move : moves) { //column
            int column = move - 1; //0 부터 시작

            for(int i = 0; i < board.length; i++) { //row
                int row = i;
                int doll = board[row][column]; //2차 배열 변수

                if(doll != 0) { //0이 아니면
                    if(stack.peek() == doll) { //스택의 마지막 숫자와 인형의 숫자가 같으면 제거 후 answer + 2
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll); //같지 않으면 추가
                        board[row][column] = 0; //추가 후 뽑힌 인형 좌표 0으로 초기화
                    }

                    break;
                }
            }
        }

        return answer;
    }
}
