class Solution {
    private void dfs(char[][] board, int m, int n, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'T';
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int l = 0; l < 4; l++) {
            int newRow = i + dx[l];
            int newCol = j + dy[l];
            dfs(board, m, n, newRow, newCol);
        }
    }

    public void solve(char[][] board) {
        int m = board.length;
        if (m == 0) return;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') dfs(board, m, n, i, 0);
            if (board[i][n - 1] == 'O') dfs(board, m, n, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') dfs(board, m, n, 0, j);
            if (board[m - 1][j] == 'O') dfs(board, m, n, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                    
                } 
                else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
