class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        /*  Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        
        int total = 0, i = 0;
        while(truckSize > 0 && i < boxTypes.length) {
            if(boxTypes[i][0] < truckSize) {
                total += (boxTypes[i][0] * boxTypes[i][1]);
            } else {
                total += (truckSize * boxTypes[i][1]);
            }
            truckSize -= boxTypes[i][0];
            i++;
        }
        return total;
        */
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int ans = 0;
        for(int[] b : boxTypes){
            int count = Math.min(b[0] , truckSize);
            ans += count * b[1];
            truckSize -= count;
            if(truckSize == 0) return ans;
        }
        return ans;
    }
}