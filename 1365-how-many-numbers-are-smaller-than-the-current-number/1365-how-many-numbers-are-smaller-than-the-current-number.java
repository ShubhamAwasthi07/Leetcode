class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            count = 0 ;
            for(int j = 0 ; j < n ; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}