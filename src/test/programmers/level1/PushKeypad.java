package test.programmers.level1;

public class PushKeypad {
    int[][] board = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,1},{3,2}}; //1을 기준으로 각 번호의 좌표

    public static void main(String[] args) {
        PushKeypad ps = new PushKeypad();
        int[] arr = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};

        System.out.println(ps.solution(arr, "right"));
    }

    int distance(int number, int pos) {//누를 번호와 현재 손 위치
        int x = Math.abs((board[pos - 1][0]) - (board[number - 1][0])); //행 : 현재 손 위치 좌표 - 눌러야 할 번호 좌표
        int y = Math.abs((board[pos - 1][1]) - (board[number - 1][1])); //열 : 현재 손 위치 좌표 - 눌러야 할 번호 좌표

        return x + y; //거리 : 행과 열의 합
    }
    String solution(int[] numbers, String hand) {
        String answer = "";

        // 초기 손 위치
        int leftPos = 10; //*
        int rightPos = 12; //#

        for(int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];

            if(temp == 1 || temp == 4 || temp == 7) { //1,4,7 = left
                answer += "L";
                leftPos = temp; //손위치 변경
            } else if(temp == 3 || temp == 6 || temp == 9) { //3,6,9 = right
                answer += "R";
                rightPos = temp;
            } else {
                if(temp == 0) {
                    temp = 11; //0을 11로 변환
                }

                int L = distance(temp, leftPos); //왼손 기준 거리
                int R = distance(temp, rightPos); //오른손 기준 거리

                if(L > R) { //왼손 기준 거리보다 오른손 기준 거리가 가까울 경우
                    answer += "R";
                    rightPos = temp;
                } else if(L < R) { //오른손 기준 거리보다 왼손 기준 거리가 가까울 경우
                    answer += "L";
                    leftPos = temp;
                } else { //같을 경우 hand 의 값으로 결정
                    if(hand.equals("right")) {
                        answer += "R";
                        rightPos = temp;
                    } else {
                        answer += "L";
                        leftPos = temp;
                    }
                }
            }
        }

        return answer;
    }
}
