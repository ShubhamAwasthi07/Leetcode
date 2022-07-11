class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        int reach  = 0;
        for(int i = 0 ; i < n; i++){
            if(reach < i)
                return false;
            reach = Math.max(reach , nums[i] + i);
        }
        return true;
    }
}

//  2 3  1 1 4
// 0  1 2 3 4 5   6 7 8 9
//  1 1 2 5 2 1  0 0  1 3      reach = 9
     