class Solution {
    public int diagonalSum(int[][] mat) {     
        
        int sum=0;
        for(int i=0; i<mat.length; i++){
            sum+= mat[i][i]; //sum of primary diagonal elements (where i=j)
            // Checking for primary diagonal element which is also a secondary diagonal element
            if(i!= mat.length-i-1){
                sum+= mat[i][mat.length-i-1]; //sum of secondary diagonal elements (where i+j=n-1)
            }    
        }
        return sum;  
    }
}