class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Map<Integer , Integer> hm = new HashMap<>();
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        
            
        for(int x : hm.keySet()){
            if(k > 0 && hm.containsKey(x - k) || k == 0 && hm.get(x) > 1){
                count++;
            }
        }
        return count;
    }
}