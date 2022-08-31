class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer , Integer> hm = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        int n = nums.length;
        if(n == 0) return ans;
        
        for(int i = 0 ; i < n ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        for(int val : hm.keySet()){
            if(hm.get(val) >= 2){
                ans.add(val);
            }
        }
        return ans;
    }
}