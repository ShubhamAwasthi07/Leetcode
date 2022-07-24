class Solution {
    public int countKDifference(int[] nums, int k) {  
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i]+k;
            if(hm.containsKey(val)){
                count+=hm.get(val);
            }
        }
        return count;
    }
}