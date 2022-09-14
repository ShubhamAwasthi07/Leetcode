class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n = 0;
        for(int[] trip : trips) n = Math.max(n , trip[2]);
        
        int[] km = new int[n + 1];
        for(int[] trip : trips){
            km[trip[1]] += trip[0];
            km[trip[2]] -= trip[0];
        }
        
        for(int x : km){
            capacity -= x;
            if(capacity < 0) return false;
        }
        return true;
    }
}