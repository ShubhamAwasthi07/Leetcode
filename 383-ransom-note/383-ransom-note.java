class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] nums = new int[26];
        for(char ch :  magazine.toCharArray()){
            nums[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(nums[ch - 'a'] == 0) return false;
            
            nums[ch - 'a']--;
        }
        return true;
    }
}