class Solution {
    public int triangleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        
       for(int i = n - 1 ; i >= 0 ; i--){
           int start = 0;
           int end = i - 1;
           
           while(start < end){
               if(nums[start] + nums[end] > nums[i]){
                   ans = ans + (end - start);
                   end--;
               }
               else
                   start++;
           }
       }
        return ans;
    }
}