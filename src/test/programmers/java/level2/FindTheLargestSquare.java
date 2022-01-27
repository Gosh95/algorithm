package test.programmers.java.level2;

public class FindTheLargestSquare {
    public static void main(String[] args) {
        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};

        System.out.println(solution(board));
    }

    static int solution(int [][]board) {
        int answer = 0;

        int max = 0;

        int[][] temp = new int[board.length + 1][board[0].length + 1];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                temp[i + 1][j + 1] = board[i][j];
            }
        }

        for(int i = 1; i < temp.length; i++) {
            for(int j = 1; j < temp[0].length; j++) {
                if(temp[i][j] == 1) {
                    int left = temp[i][j - 1];
                    int leftUp = temp[i - 1][j - 1];
                    int up = temp[i - 1][j];

                    int min = Math.min(left, Math.min(leftUp, up));

                    temp[i][j] = min + 1;
                    max = Math.max(max, temp[i][j]);
                }
            }
        }

        answer = max * max;

        return answer;
    }
}
