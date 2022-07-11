class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if(n < 3) return ans;
        int target = 0;
        
        for(int i = 0 ; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int start = i + 1;
            int end = n -1;
            
            int reqTarget = target - nums[i];
            
            while(start < end){
                int sum = nums[start] + nums[end];
                
                if(sum == reqTarget){
                    ans.add(Arrays.asList(nums[i] ,nums[start], nums[end]));
                    
                    
                    start++;
                    end--;
            while(start < end && nums[start] ==  nums[start - 1]){
                start++;
            }
            while(start < end && nums[end] == nums[end + 1]){
                end--;
            }
                    
                }
                else if( sum < reqTarget) start++;
                else end --;
            } 
           
        }
        return ans ;
    }
}