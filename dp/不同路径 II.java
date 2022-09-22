class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) return 0;
        dp[0][0] = 1;
        // 注意下面两个初始化细节
        for (int i = 1; i < n; i++)
            if (obstacleGrid[0][i] == 0 && dp[0][i - 1] == 1) dp[0][i] = 1;

        for (int i = 1; i < m; i++)
            if (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) dp[i][0] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int sum = 0;
                if (obstacleGrid[i - 1][j] == 0) sum += dp[i - 1][j];
                if (obstacleGrid[i][j - 1] == 0) sum += dp[i][j - 1];
                dp[i][j] = sum;
            }
        }
        return dp[m - 1][n - 1];
    }
}