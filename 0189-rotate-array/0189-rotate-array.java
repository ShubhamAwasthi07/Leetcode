class Solution {
    public void reverse(int[] nums , int left , int right){
        int i = left;
        int j = right;
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0) k = k + nums.length;
        
        reverse(nums , 0 , nums.length - k - 1);
        reverse(nums , nums.length - k , nums.length - 1);
        reverse(nums, 0 , nums.length-1);
        
    }
}