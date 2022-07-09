class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0;
        int j = nums.length - 1;
        
        while(i <= j){
            if(nums[i] == val){
                nums[i] = nums[j];
                j--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}
 // 0 1 2 3    i  = 2 , j = 1   while(i <= j)
 // 3 2 2 3 
 // 2 2 2 3