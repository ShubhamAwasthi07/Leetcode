class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int count = 0;
        
        for(int val : nums){
            if(val == 0)
                count = 0;
            else{
                count++;
                maxOnes = Math.max(count , maxOnes);
            }
        }
        return maxOnes;
    }
}