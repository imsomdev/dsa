class Solution {

    private void dfs(char[][] grid, int m, int n, int row, int col) {
        grid[row][col] = '2';
        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        for (int i = 0; i < 4; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];
            if (newRow < m && newRow >= 0 && newCol < n && newCol >= 0 && grid[newRow][newCol] == '1') {
                dfs(grid, m, n, newRow, newCol);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, m, n, i, j);
                    result++;
                }
            }
        }
        return result;
    }
}
