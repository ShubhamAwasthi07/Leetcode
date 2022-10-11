class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        int first = nums[0];
        
        for(int i = 0 ; i < n ; i++){
            
            if(count == 0){
                first = nums[i];
                count++;
            }
            else if(first == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return first;
    }
}