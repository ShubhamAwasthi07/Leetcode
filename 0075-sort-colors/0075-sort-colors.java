class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        
        for(int i = 0 ; i < n ; i++){
               
            if(nums[i] == 0)
                countZero++;
            else if(nums[i] == 1)
                countOne++;
            else
                countTwo++;   
        }
        
        for(int i = 0 ; i < n ; i++){
            if(countZero-- > 0)
                nums[i] = 0;
            else if(countOne-- > 0)
                nums[i] = 1;
            
            else 
                nums[i] = 2;
        }
    }
        
}

