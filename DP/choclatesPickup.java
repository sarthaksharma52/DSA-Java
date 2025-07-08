class Solution {
    public int solve(int n, int m, int[][] grid) {
        Integer[][][] dp = new Integer[n][m][m];
        return dfs(0, 0, m - 1, grid, dp);
    }

    private int dfs(int row, int col1, int col2, int[][] grid, Integer[][][] dp) {
        int n = grid.length;
        int m = grid[0].length;

        if (col1 < 0 || col1 >= m || col2 < 0 || col2 >= m) return Integer.MIN_VALUE;

        if (row == n - 1) {
            if (col1 == col2) return grid[row][col1];
            else return grid[row][col1] + grid[row][col2];
        }

        if (dp[row][col1][col2] != null) return dp[row][col1][col2];

        int maxChocolates = 0;
        for (int move1 = -1; move1 <= 1; move1++) {
            for (int move2 = -1; move2 <= 1; move2++) {
                int newCol1 = col1 + move1;
                int newCol2 = col2 + move2;
                int temp = dfs(row + 1, newCol1, newCol2, grid, dp);
                maxChocolates = Math.max(maxChocolates, temp);
            }
        }

        int currentChocolates = (col1 == col2) ? grid[row][col1] : grid[row][col1] + grid[row][col2];
        dp[row][col1][col2] = currentChocolates + maxChocolates;

        return dp[row][col1][col2];
    }
}
