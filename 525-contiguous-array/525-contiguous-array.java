class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        int sum =  0;
        int target = 0;
        int len = 0;
        Map<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            
            if(sum == target){
                len = i+1;
            }
            else if(hm.containsKey(sum - target)){
                len = Math.max(len , i - hm.get(sum - target));
            }
            if(!hm.containsKey(sum)){
                hm.put(sum , i);
            }
        }
        return len;
    }
}