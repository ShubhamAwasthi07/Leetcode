class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] res = new int[2];
        
        int sum = (n * (n+1)) / 2;
        Map<Integer , Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
           hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        }
        int s = 0;
        for(int val : hm.keySet()){
            if(hm.get(val) > 1){
                res[0] = val;
            }
            s = s + val;
        }
        int diff = sum - s;
        res[1] = diff;
        return res;
    }
}