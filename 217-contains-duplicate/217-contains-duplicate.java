class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Set<Integer> s = new HashSet<>();
        
//         for(Integer ele : nums){
//             if(s.contains(ele)){
//                 return true;
//             }
//             s.add(ele);
//         }
//         return false;
        Arrays.sort(nums);
        for(int  i = 1; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}