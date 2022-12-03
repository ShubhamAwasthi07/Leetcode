class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int fs = 0;
        int ss = 0;
        for(int i = n-1 ; i >=0 ; i--){
            int step = cost[i] + Math.min(fs , ss);
            ss = fs;
            fs = step;
        }
        return Math.min(fs , ss);
    }
}


