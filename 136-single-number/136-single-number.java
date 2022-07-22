class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        Map<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        for(Integer a : hm.keySet()){
            if(hm.get(a) == 1){
                return a;
            }
        }
        return 0;
    }
}