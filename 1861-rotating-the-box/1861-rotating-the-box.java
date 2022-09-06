class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        
        char[][] res = new char[n][m];
        
        for(int i = 0 ; i < m ; i++){
            int bottomMost = n - 1;
            
            for(int j = n - 1 ; j >= 0 ; j--){
                res[j][m - 1 - i] = '.';
                
                if(box[i][j] == '#'){
                    // there is a stone
                    
                    res[bottomMost][m - 1 - i] = '#';
                    bottomMost--;
                }
                else if(box[i][j] == '*'){
                    // this cell is blocked
                    res[j][m - 1 - i] = '*';
                    bottomMost = j - 1;
                }
            }
        }
        return res;
    }
}