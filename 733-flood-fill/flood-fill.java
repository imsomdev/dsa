class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int originalColor = image[sr][sc];
        if (originalColor == color) {
            return image;
        }
        int[] dRow = { 0, 0, 1, -1 };
        int[] dCol = { 1, -1, 0, 0 };
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { sr, sc });
        while (!queue.isEmpty()) {
            int[] pixel = queue.poll();
            int r = pixel[0];
            int c = pixel[1];
            image[r][c] = color;
            for (int i = 0; i < 4; i++) {
                int newRow = r + dRow[i];
                int newCol = c + dCol[i];
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && image[newRow][newCol] == originalColor) {
                    queue.add(new int[] { newRow, newCol });
                }
            }
        }

        return image;
    }
}
