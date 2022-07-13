class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int ele : nums){
            if(hm.containsKey(ele)){
                ans += hm.get(ele);
            }
            hm.put(ele , hm.getOrDefault(ele , 0) + 1);
        }
        return ans;
    }
}