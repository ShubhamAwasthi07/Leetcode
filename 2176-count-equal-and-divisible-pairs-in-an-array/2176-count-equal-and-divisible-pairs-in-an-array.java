class Solution {
    public int countPairs(int[] nums, int k) {
        
        int n = nums.length;
        Map<Integer , List<Integer>> hm = new HashMap<>();
        int count = 0;
        
        for(int i = 0 ; i < n ; i++){
            
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i] , new ArrayList<Integer>());
            }
            else{
                for(int val : hm.get(nums[i])){
                    int pro = val * i;
                    if(pro % k == 0){
                        count++;
                    }
                }
            }
            hm.get(nums[i]).add(i);
        }
        return count;
    }
}