class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key) == 1){
                ans += key;
            }
        }
        return ans;
    }
}