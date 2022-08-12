class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int v : nums){
            ans = v ^ ans;
        }
        return ans;
    }
}