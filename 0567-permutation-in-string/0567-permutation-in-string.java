class Solution {
    
    public boolean allZero(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0)
                return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        
        int[] hm = new int[26];
        
        if(s1.length() > s2.length())
            return false;
        
        for(int i = 0 ; i < s1.length() ; i++){
            
            hm[s1.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < s2.length() ; i++){
            hm[s2.charAt(i) - 'a']--;
            if(i - s1.length() >= 0)
                hm[s2.charAt(i - s1.length()) - 'a']++;
            
            if(allZero(hm))
                return true;
                
        }
        return false;
    }
}