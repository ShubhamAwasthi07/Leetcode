class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     /*  int n = nums.length;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1; j < n && (j - i) <= k; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;*/
        
        int n = nums.length;
        Map<Integer , Integer> hm = new HashMap<>();
        for(int  i = 0 ; i < n ; i++){
            if(hm.containsKey(nums[i]) && (i-hm.get(nums[i]) <= k)){
                return true;
            }
            hm.put(nums[i] , i);
        }
        return false;
        
    }
}