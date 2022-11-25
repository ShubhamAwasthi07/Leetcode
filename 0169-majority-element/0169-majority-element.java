class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        int max = 0;
        for(int val : hm.keySet()){
            if(hm.get(val) > Math.floor(n/2)){
                max = Math.max(max , val);
            }
        }
        return max;
    }
}