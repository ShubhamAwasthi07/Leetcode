class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0)
                countZero++;
            else{
                nums[k++] = nums[i];
            }
        }
        for(int j = 0 ; j < countZero ; j++){
            nums[k++] = 0;
        }
    }
}