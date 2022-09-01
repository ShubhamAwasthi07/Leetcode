class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        
        Map<Integer , Integer> hm = new HashMap<>();
        int[] prefix_sum = new int[n];
        prefix_sum[0] = nums[0];
        
        for(int i = 1 ; i < n ; i++){
            prefix_sum[i] = prefix_sum[i-1] + nums[i];
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(prefix_sum[i] - k)){
                count = count + hm.get(prefix_sum[i] - k);
            }
            if(prefix_sum[i] == k) count++;
            
            hm.put(prefix_sum[i] , hm.getOrDefault(prefix_sum[i] , 0) + 1);
        }
        return count;
    }
}