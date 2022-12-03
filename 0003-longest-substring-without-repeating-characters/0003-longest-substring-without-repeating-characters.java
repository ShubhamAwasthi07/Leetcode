class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int[] hm = new int[256];
        int repeat = 0;
        int start = 0;
        int end = 0;
        int ans = 0;
        
        while(end < n){
            //1. Expansion
            char ch = s.charAt(end);
            hm[ch]++;
            
            if(hm[ch] > 1) repeat++;
            end++;
            
            //2. Contraction
            
            while(repeat > 0){
                hm[s.charAt(start)]--;
                if(hm[s.charAt(start)] == 1) repeat--;
                start++;
            }
            
            // operation
            ans = Math.max(ans , end - start);
            
        }
        return ans;
    }
}