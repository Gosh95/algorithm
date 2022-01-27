package test.programmers.java.level2;

import java.util.Arrays;

public class CreateMinimum {
    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};

        System.out.println(solution(a, b));
    }

   static int solution(int []A, int []B)
    {
        int answer = 0;
        int lastIdx = B.length - 1;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[lastIdx - i];
        }

        return answer;
    }
}
