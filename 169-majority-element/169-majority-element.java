class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
       Map<Integer , Integer> hm = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        // int m = 0;
        for(Integer c : hm.keySet()){
            if(hm.get(c) > Math.floor(n/2)){
                return c;
            }
        }
        return 0;
    }
}