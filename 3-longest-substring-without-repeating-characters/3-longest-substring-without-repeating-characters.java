class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] hm = new int[256];
        int start = 0;
        int end = 0;
        int repeat = 0;
        int ans = 0;
        while(end < n){
            // 1.Expensation
            char ch = s.charAt(end);
            hm[ch]++;
            
            if(hm[ch] > 1) repeat++;
            end++;
            
            // 2. Contraction
            
            while(repeat > 0){
                hm[s.charAt(start)]--;
                
                if(hm[s.charAt(start)] == 1) repeat--;
                start++;
                
            }
            // 3.Operation
            ans = Math.max(ans , end - start);
        }
        return ans;
    }
}