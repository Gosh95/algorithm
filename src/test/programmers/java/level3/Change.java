package test.programmers.java.level3;

public class Change {
    public int solution(int n, int[] money) {
        int[] dp = new int[100001];
        dp[0] = 1;
        for(int m : money) {
            for(int i = m; i < n + 1; i++) {
                dp[i] += dp[i - m];
            }
        }

        return dp[n] % 1000000007;
    }
}
