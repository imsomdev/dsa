class Solution {
    public void dfs(int[][] image, int orgColor, int[] delRow, int[] delCol,  int sr, int sc,int color){
        image[sr][sc] = color;
        for(int i=0; i< 4; i++){
            int row = sr + delRow[i];
            int col = sc + delCol[i];
            if(row < image.length && row >= 0 && col <image[0].length && col >= 0 && image[row][col]==orgColor){
                dfs(image, orgColor, delRow, delCol, row, col,color);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgColor = image[sr][sc];
        if(orgColor == color){
            return image;
        }
        int[] delRow = {0, 1, 0, -1};
        int[] delCol = {1, 0, -1, 0};
        dfs(image, orgColor, delRow, delCol, sr, sc,color);
        return image;
    }
}