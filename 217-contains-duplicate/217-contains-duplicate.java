class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        
        for(Integer ele : nums){
            if(s.contains(ele)){
                return true;
            }
            s.add(ele);
        }
        return false;
    }
}