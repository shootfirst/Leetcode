class Solution {
    public int integerBreak(int n) {
        int [] dp = new int[n + 1];
        for (int i = 1; i < n; i++) dp[i] = i;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] * (i - j));
            }
        }
        return dp[n];
    }
}