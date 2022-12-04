class Solution {
    
    public void DFS(int[][] image , int row , int col , int newColor , int oldColor){
        
        if(row >= image.length || row < 0 || col >= image[0].length || col < 0 || image[row][col] != oldColor)
            return ;
        
        image[row][col] = newColor;
        
        DFS(image , row - 1 , col , newColor , oldColor);
        DFS(image , row + 1 , col , newColor , oldColor);
        DFS(image , row , col - 1 , newColor , oldColor);
        DFS(image , row , col + 1 , newColor , oldColor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        if(color == image[sr][sc])
            return image;
        
        DFS(image , sr , sc , color , image[sr][sc]);
        return image;
    }
}