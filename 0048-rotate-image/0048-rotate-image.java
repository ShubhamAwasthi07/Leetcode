class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int layers = n/2;
        
        for(int layer = 0 ; layer < layers ; layer++){
            int start = layer;
            int end = n - 1 - layer;
            
            for(int i = start ; i < end ; i++){
                
                // top in temp
                int temp = matrix[start][i];
                
                // left in top
                matrix[start][i] = matrix[n - 1 - i][start];
                
                // bottom in left
                matrix[n - 1 - i][start] = matrix[end][n - 1 - i];
                
                // right in buttom
                matrix[end][n - 1 - i] = matrix[i][end];
                
                // temp to right
                matrix[i][end] = temp;
            }
        }
    }
}