class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n  = nums.length;
        Map<Integer , Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            int a = nums[i];
            int b = target - nums[i];
            
            if(hm.containsKey(b)){
                return new int[]{hm.get(b) , i};
            } 
            hm.put(a , i);
        }
        return new int[]{-1 , -1};
    }
}