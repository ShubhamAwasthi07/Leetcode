class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
             if(hm.containsKey(nums[i])){
                 return true;
             }
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        return  false;
    }
}