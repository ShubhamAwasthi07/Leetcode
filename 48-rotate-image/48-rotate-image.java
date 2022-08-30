class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length/2; i++){
            work(matrix, i, matrix.length -1 - i);
        }
        return;
    }
    
//     Does the rotation on a layer.
    private void work(int[][] matrix, int start, int end){
        int i1= start,j1 = start,i2 = end,j2 = start;
        int icr1=1,jcr1=0,icr2=0,jcr2=1;
        while(true){
            if(i1 == start && j1 == end){
                break;
            }
            swap(matrix, i1, j1, i2, j2);
            if(i1 == end && j1 == start){
                icr1 = 0;
                jcr1 = 1;
                icr2 = -1;
                jcr2 = 0;
            }
            else if(i1 == end && j1 == end){
                icr1 = -1;
                jcr1 = 0;
                icr2 = 0;
                jcr2 = -1;
            }
            i1+=icr1;
            j1+=jcr1;
            i2+=icr2;
            j2+=jcr2;
        }
        
    }
    
//     Swapping of two elements
    private void swap(int matrix[][], int i1, int j1, int i2, int j2){
        if(i1 == i2 && j1 == j2){
            return;
        }
        matrix[i1][j1] = matrix[i1][j1] + matrix[i2][j2];
        matrix[i2][j2] = matrix[i1][j1] - matrix[i2][j2];
        matrix[i1][j1] = matrix[i1][j1] - matrix[i2][j2];
        return;
    }
    
}