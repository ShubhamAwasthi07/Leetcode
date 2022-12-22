class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        // int ans = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int ans = 0;
            for(int j = 0; j < m ; j++){
                ans = ans + accounts[i][j];
                
            } 
            maxi = Math.max(ans , maxi);
        }
        return maxi;
    }
}