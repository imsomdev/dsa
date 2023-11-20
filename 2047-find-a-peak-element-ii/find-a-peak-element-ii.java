class Solution {

    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int midCol = lo + (hi - lo) / 2;
            int maxRow = findMaxRow(mat, midCol, m);

            int maxElement = mat[maxRow][midCol];

            if (checkNeighbors(mat, maxRow, midCol, m, n)) {
                return new int[] { maxRow, midCol };
            } else if (midCol > 0 && mat[maxRow][midCol - 1] > maxElement) {
                hi = midCol - 1;
            } else {
                lo = midCol + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    private int findMaxRow(int[][] mat, int col, int m) {
        int maxRow = 0;
        for (int i = 1; i < m; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }

    private boolean checkNeighbors(int[][] mat, int row, int col, int m, int n) {
        int maxElement = mat[row][col];
        int top = row > 0 ? mat[row - 1][col] : Integer.MIN_VALUE;
        int bottom = row < m - 1 ? mat[row + 1][col] : Integer.MIN_VALUE;
        int left = col > 0 ? mat[row][col - 1] : Integer.MIN_VALUE;
        int right = col < n - 1 ? mat[row][col + 1] : Integer.MIN_VALUE;

        return maxElement >= top && maxElement >= bottom && maxElement >= left && maxElement >= right;
    }
}
