class Solution {
    public boolean increasingTriplet(int[] nums) {
    
        if(nums.length < 3 || nums.length == 0)
            return false;
            
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for(int n:nums){
            if(first>=n)
                first=n;
            else if(second>=n)
                second=n;
            else 
                return true;
        }
        
        return false;
    }
}