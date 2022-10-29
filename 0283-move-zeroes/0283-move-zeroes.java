class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0)
                countZero++;
            else{
                nums[k] = nums[i];
                k++;
            }
        }
        for(int i = 0 ; i < countZero ; i++){
            nums[k++] = 0;
        }
    }
}