class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
       Map<Integer , Integer> hm = new HashMap<>();
        int sum = 0;
        int k = 0;
        int len = 0;
        for(int i = 0 ; i < n ; i++){
            sum = sum + nums[i];
            
            if(sum == k)
                len = i + 1;
            
            if(hm.containsKey(sum - k)){
                len = Math.max(len , i - hm.get(sum - k));
            }
            if(!hm.containsKey(sum))
                hm.put(sum , i);
        }
        return len;
    }
}