class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;
        
        for(int i = 0 ; i < k ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        ans[idx++] = hm.lastKey(); 
        
        int start = 0;
        int end = k;
        
        while(end < n){
            // 1. Remove start
            if(hm.get(nums[start]) - 1 == 0)
                hm.remove(nums[start]);
            else
                hm.put(nums[start] , hm.get(nums[start]) - 1);
            start++;
            
            //2.  add end
            hm.put(nums[end] , hm.getOrDefault(nums[end], 0) + 1);
            end++;
            
            //3 . add max to ans
            ans[idx++] = hm.lastKey();
        }
        return ans;
    }
}