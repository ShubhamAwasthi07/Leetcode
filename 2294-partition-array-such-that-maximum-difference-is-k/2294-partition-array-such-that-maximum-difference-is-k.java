class Solution {
    public int partitionArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        int res = 1;
        int curr_min = nums[0];
        for(int curr : nums){
            if((curr - curr_min) <= k)
                continue;
            res++;
            curr_min = curr;
        }
        return res;
    }
}