package test.programmers.java.level2;

public class TargetNumber {

    static int length;
    static int answer = 0;

    public int solution(int[] numbers, int target) {
        length = numbers.length;

        dfs(0, 0, numbers, target);

        return answer;
    }

    static void dfs(int idx, int result, int[] numbers, int target) {
        if (idx == length) {
            if (result == target) {
                answer++;
            }

            return;
        }

        dfs(idx + 1, result + numbers[idx], numbers, target);
        dfs(idx + 1, result - numbers[idx], numbers, target);
    }
}
