class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        Map<Integer , Integer> hm = new HashMap<>();
        
        int odd = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] % 2 == 1){
                odd++;
            }
            hm.put(odd , hm.getOrDefault(odd , 0) + 1);
        }
        
        int ans = 0;
        for(int val : hm.keySet()){
            if(hm.containsKey(val - k)){
                ans += hm.get(val) * hm.get(val - k);
            }
        }
        ans += hm.getOrDefault(k , 0);
        return ans;
    }
}