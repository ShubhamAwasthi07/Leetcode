class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        
        Map<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        
        int ans = 0;
        for(int num : hm.keySet()){
            if(!hm.containsKey(num - 1)){
                int len = 1;
                int currNum = num + 1;
                
                while(hm.containsKey(currNum)){
                    len++;
                    currNum++;
                }
                ans = Math.max(ans , len);
            }
        }
        return ans;
    }
}