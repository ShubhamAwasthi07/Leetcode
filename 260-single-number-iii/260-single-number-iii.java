class Solution {
    public int[] singleNumber(int[] nums) {
      Map<Integer , Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        int[] ans = new int[2];
        int k = 0;
        for(int val : hm.keySet()){
            if(hm.get(val) == 1){
                ans[k] = val;
                k++;
            }
        }
        return ans;
    }
}