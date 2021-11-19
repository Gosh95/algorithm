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

        for(int move : moves) {
            int column = move - 1;

            for(int i = 0; i < board.length; i++) {
                int row = i;
                int doll = board[row][column];

                if(doll != 0) {
                    if(stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(doll);
                    }

                    board[row][column] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
