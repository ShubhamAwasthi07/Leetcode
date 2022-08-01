class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0] . length;
        
        int[] roww = new int[row];
        int[] coll = new int[col];
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(matrix[i][j] == 0){
                    roww[i] = -1;
                    coll[j] = -1;
                }
            }
        }
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(roww[i] == -1 || coll[j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    } 
}


