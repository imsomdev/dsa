class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRowZero = false, firstColZero = false;
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
            }
        }
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = matrix.length - 1; i > 0; i--){
            for(int j = matrix[0].length - 1; j > 0; j--){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowZero){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColZero){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        

    }
}