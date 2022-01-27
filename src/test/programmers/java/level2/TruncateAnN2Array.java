package test.programmers.java.level2;

import java.util.ArrayList;

public class TruncateAnN2Array {
    public static void main(String[] args) {
    }

    static public ArrayList<Long> solution(int n, long left, long right) {
        ArrayList<Long> arr = new ArrayList<>();

        for(long i = left; i <= right; i++) {
            //문제 규칙 상 행 열 의 숫자 중 큰 숫자가 해당 자리의 숫자가 된다.
            //ex) (1, 2) => 2, (1, 4) => 4
            //배열은 0부터 시작하므로 max 값에 +1을 해준다.
            //** 2차 배열을 일자로 정렬할 경우 (지정 위치 / 2차배열 사이즈) = 행, (지정 위치 % 2차배열 사이즈) = 열 이 된다.
            arr.add(Math.max((i / n), (i % n)) + 1);
        }

        //꼭 주어진 answer 를 리턴할 필요는 없다.
        return arr;
    }
}

