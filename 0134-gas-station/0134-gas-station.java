class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int idx = 0;
        int curr = 0;
        int total = 0;
        
        for(int i = 0 ; i < n ; i++){
            total = total + gas[i] - cost[i];
            curr = curr + gas[i] - cost[i];
            
            if(curr < 0){
                curr = 0;
                idx = i+1;
            }            
        }
        return (total < 0) ? -1 : idx;
    }
}