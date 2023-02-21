class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        Map<Integer , Integer> hm = new HashMap<>();
        
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        
        for(int v : hm.keySet()){
            if(hm.get(v) == 1){
                return v;
            }
        }
        return -1;
    }
}