class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
       // Return true if there are only two points. Because joining two points will always form a straight line.
        if(coordinates.length==2) return true;
        
        // Point 1 (fixed)
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        
        // Point 2 (fixed)
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        
		// Loop from the 3rd point until the end of the coordinates array.
        for(int i=2; i<coordinates.length; i++){
            // New point
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
            
            // Compare slopes. If not same, return false.
            if((y2-y1)*(x3-x2) != (y3-y2)*(x2-x1)){
                return false;
            }
        }
		
        // If all the slope comparisons match, return true.
        return true;
        
    }
}